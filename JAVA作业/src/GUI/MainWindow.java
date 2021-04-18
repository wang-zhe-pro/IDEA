package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public   class MainWindow extends JFrame implements ActionListener {

    JButton bt1;
    JButton bt2;
    JButton bt3;
    JButton bt4;
    JButton bt5;
    JPanel panel;
    JPanel panel2;
    JLabel label;


    MainWindow(){
        this.setSize(900, 700);
        this.setTitle("学生课程管理系统");
        this.setLayout(null);
        this.setLocation(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bt1=new JButton("查询课程");
        bt1.setSize(150, 50);
        bt1.setLocation(150, 400);
        bt1.addActionListener(this);
        bt1.setActionCommand("查询课程");

        bt2=new JButton("退选课程");
        bt2.setSize(150, 50);
        bt2.setLocation(150, 500);
        bt2.addActionListener(this);
        bt2.setActionCommand("退选课程");

        bt3=new JButton("添加课程");
        bt3.setSize(150, 50);
        bt3.setLocation(550, 400);
        bt3.addActionListener(this);
        bt3.setActionCommand("添加课程");

        bt4=new JButton("修改课程");
        bt4.setSize(150, 50);
        bt4.setLocation(550, 500);
        bt4.addActionListener(this);
        bt4.setActionCommand("修改课程");


        this.add(bt1);
        this.add(bt2);
        this.add(bt3);
        this.add(bt4);

        panel=new JPanel();
        panel.setLocation(100, 20);
        panel.setLayout(null);
        panel.setBackground(Color.GREEN);
        this.add(panel);

        panel2=new JPanel();
        panel2.setSize(650,350);
        panel2.setLocation(100, 20);
        panel2.setLayout(null);
        panel2.setBackground(Color.CYAN);

        label=new JLabel();
        label.setText("欢迎登陆课程管理系统");
        label.setLocation(165,60);
        label.setSize(600, 400);
        panel2.add(label);
        label.setFont( (new Font("仿宋",Font.BOLD,30)));
        this.add(panel2);
        panel2.setVisible(true);

        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        JButton bt=(JButton )e.getSource();
        //移除上一个面板
        if(bt!=null)
        {
            this.remove(panel2);
            this.remove(panel);
        }
        if(bt.getText().equals("查询课程"))
        {
            panel=new FindCourse();
            panel.setLocation(100, 20);
            this.add(panel);
            this.repaint();
        }

        else {
            if(bt.getText().equals("添加课程"))
            {
                panel=new AddCourse();
                panel.setLocation(100, 20);
                this.add(panel);
                this.repaint();
            }

            else {
                if(bt.getText().equals("退选课程"))
                {
                    panel=new DeleteCourse();
                    panel.setLocation(100, 20);
                    this.add(panel);
                    this.repaint();
                }

                else {
                    if(bt.getText().equals("修改课程"))
                    {
                        panel=new UpdateCourse();
                        panel.setLocation(100, 20);
                        this.add(panel);
                        this.repaint();
                    }
                }



                }
            }
        }
    }





