package FileTest;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.Color;

public class Class_1 {
    public static void main(String[] args) {
        new Thread(new Server()).start();
        new Thread(new Client()).start();
    }
}

class Client extends Thread implements ActionListener {
    private Socket connect;

    private StringBuilder showContent = new StringBuilder();
    private JFrame jf = new JFrame("客户端");
    private JTextArea show = new JTextArea();
    private JTextArea input = new JTextArea();
    private JButton send = new JButton("发送");

    public Client() {
        // 创建界面
        jf.setSize(315, 317);
        jf.setLayout(null);

        show.setSize(300, 200);
        show.setLocation(0, 0);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        show.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jf.add(show);

        input.setSize(220, 80);
        input.setLocation(0, 200);
        input.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jf.add(input);

        send.setSize(80, 25);
        send.setLocation(220, 228);
        send.addActionListener(this);
        jf.add(send);

        jf.setResizable(true);
        jf.setVisible(true);
    }

    public void run() {
        try {
            // 等待一秒后连接服务端
            sleep(1000);
            connect = new Socket("127.0.0.1", Server.port);
            DataInputStream client_rx = new DataInputStream(connect.getInputStream());

            // 读取
            System.out.println("here");
            while (true) {
                String line = client_rx.readUTF();
                System.out.println(line);
                showContent.append(line + System.lineSeparator()); // 更新储存
                show.setText(showContent.toString()); // 更新显示
            }
        } catch (IOException e) {
            System.out.println(e);
            System.exit(0);
        } catch (InterruptedException e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tmp = input.getText();
        showContent.append(tmp + System.lineSeparator()); // 更新储存
        show.setText(showContent.toString()); // 更新显示
        try {
            new DataOutputStream(connect.getOutputStream()).writeUTF(tmp);
        } catch (IOException e1) {
            System.out.println(e);
            System.exit(0);
        }
        input.setText(""); // 清除输入框
    }
}

class Server extends Thread implements ActionListener {
    public static final int port = 45; // 服务端固定端口
    private Socket client;

    private StringBuilder showContent = new StringBuilder();
    private JFrame jf = new JFrame("服务端");
    private JTextArea show = new JTextArea();
    private JTextArea input = new JTextArea();
    private JButton send = new JButton("发送");

    public Server() {
        // 创建界面
        jf.setSize(315, 317);
        jf.setLayout(null);

        show.setSize(300, 200);
        show.setLocation(0, 0);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        show.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jf.add(show);

        input.setSize(220, 80);
        input.setLocation(0, 200);
        input.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jf.add(input);

        send.setSize(80, 25);
        send.setLocation(220, 228);
        send.addActionListener(this);
        jf.add(send);

        jf.setResizable(true);
        jf.setVisible(true);
    }

    public void run() {
        try {
            // 监听
            ServerSocket ss = new ServerSocket(port);
            client = ss.accept();
            ss.close();
            System.out.println("here");

            // 读取
            DataInputStream server_rx = new DataInputStream(client.getInputStream());
            while (true) {
                String line = server_rx.readUTF();
                System.out.println(line);
                showContent.append(line + "\n"); // 更新储存
                show.setText(showContent.toString()); // 更新显示
            }
        } catch (IOException e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tmp = input.getText();
        showContent.append(tmp + System.lineSeparator()); // 更新储存
        show.setText(showContent.toString()); // 更新显示
        try {
            new DataOutputStream(client.getOutputStream()).writeUTF(tmp);
        } catch (IOException e1) {
            System.out.println(e);
            System.exit(0);
        }
        input.setText(""); // 清除输入框
    }
}