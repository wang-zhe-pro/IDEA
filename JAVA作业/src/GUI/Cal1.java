

package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cal1 extends JPanel implements  ActionListener {
    public Cal1() {
        initComponents();
    }

    private void initComponents() {

        frame1 = new JFrame();
        frame1.setVisible(true);
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        label1 = new JLabel();


        {
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);


            label2.setText("\u8fd0\u7b97\u65701");
            frame1ContentPane.add(label2);
            label2.setBounds(40, 55, 65, label2.getPreferredSize().height);


            textField1.addActionListener(this);
            frame1ContentPane.add(textField1);
            textField1.setBounds(120, 55, 135, textField1.getPreferredSize().height);


            label3.setText("\u8fd0\u7b97\u65702");
            frame1ContentPane.add(label3);
            label3.setBounds(new Rectangle(new Point(40, 115), label3.getPreferredSize()));


            textField2.addActionListener(this);
            frame1ContentPane.add(textField2);
            textField2.setBounds(120, 110, 135, textField2.getPreferredSize().height);


            label4.setText("\u8fd0\u7b97\u7ed3\u679c");
            frame1ContentPane.add(label4);
            label4.setBounds(new Rectangle(new Point(40, 180), label4.getPreferredSize()));
            frame1ContentPane.add(textField3);
            textField3.setBounds(120, 170, 135, textField3.getPreferredSize().height);


            button1.setText("\u76f8\u52a0");
            button1.addActionListener(this);
            frame1ContentPane.add(button1);
            button1.setBounds(15, 230, 70, 40);


            button2.setText("\u76f8\u51cf");
            button2.addActionListener(this);
            frame1ContentPane.add(button2);
            button2.setBounds(115, 230, 70, 40);


            button3.setText("清零");
            button3.addActionListener(this);
            frame1ContentPane.add(button3);
            button3.setBounds(200, 230, 70, 40);


            label1.setText("\u7b80\u6613\u8ba1\u7b97\u5668");
            frame1ContentPane.add(label1);
            label1.setBounds(120, 15, 85, label1.getPreferredSize().height);

            {

                Dimension preferredSize = new Dimension();
                for(int i = 0; i < frame1ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = frame1ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = frame1ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                frame1ContentPane.setMinimumSize(preferredSize);
                frame1ContentPane.setPreferredSize(preferredSize);
            }
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }

    }


    private JFrame frame1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label4;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label1;
    String s1="0";
    String s2="0";


    public static void main(String[] args) {
            Cal1 a=new Cal1();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n;
        double a=0;
        if(e.getSource()==textField1){
            int flag=0;
            s1=textField1.getText();
            char h[]=s1.toCharArray();
            for(int i=0;i<h.length;i++){
                int x=(int)h[i];
                if(x==46){
                    flag++;
                    if(flag==2){
                        textField3.setText("输入错误重新输入");
                    }
                }
                if((i==0&&x==46)||(i==h.length&&x==46)){
                    textField3.setText("输入错误重新输入");
                }
                if(x!=46&&(x<48||x>57)){
                    textField3.setText("输入错误重新输入");
                }
            }


        }
        else if(e.getSource()==textField2){
            int flag=0;
            s2=textField2.getText();
            char h[]=s2.toCharArray();
            for(int i=0;i<h.length;i++){
                int x=(int)h[i];
                if(x==46){
                    flag++;
                    if(flag==2){
                        textField3.setText("输入错误重新输入");
                    }
                }
                if((i==0&&x==46)||(i==h.length&&x==46)){
                    textField3.setText("输入错误重新输入");
                }
                if(x!=46&&(x<48||x>57)){
                    textField3.setText("输入错误重新输入");
                }
            }
        }
        else if(e.getSource()==button1){
            a=Double.parseDouble(s1)+Double.parseDouble(s2);
            textField3.setText(Double.toString(a));
        }
        else if(e.getSource()==button2){
            a=Double.parseDouble(s1)-Double.parseDouble(s2);
            textField3.setText(Double.toString(a));
        }
        else if(e.getSource()==button3){
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
        }


    }

    }

