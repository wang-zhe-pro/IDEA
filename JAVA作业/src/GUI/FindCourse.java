package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public  class FindCourse extends JPanel implements ActionListener{
    JLabel Inputlabel;
    JTextField Inputtext;
    JButton Findbt;
    JLabel Namelabel;
    JLabel Typelabel;
    JLabel Teacherlabel;
    JLabel Creditlabel;
    JTextField Nametext;
    JTextField Teachertext;
    JTextField Credittext;
    JTextField Typetext;

    public FindCourse() {

        this.setSize(650,350);
        this.setLocation(100, 20);
        this.setLayout(null);
        this.setBackground(Color.lightGray);



        Namelabel=new JLabel("课程名称");
        Namelabel.setSize(100,30);
        Namelabel.setLocation(100, 120);
        this.add(Namelabel);

        Nametext=new JTextField();
        Nametext.setSize(120,30);
        Nametext.setLocation(220, 120);
        this.add(Nametext);

        Teacherlabel=new JLabel("授课教师");
        Teacherlabel.setSize(100,30);
        Teacherlabel.setLocation(100, 160);
        this.add(Teacherlabel);

        Teachertext=new JTextField();
        Teachertext.setSize(120,30);
        Teachertext.setLocation(220, 160);
        this.add(Teachertext);

        Typelabel=new JLabel("课程类型");
        Typelabel.setSize(100,30);
        Typelabel.setLocation(100, 200);
        this.add(Typelabel);

        Typetext=new JTextField();
        Typetext.setSize(120, 30);
        Typetext.setLocation(220, 200);
        this.add(Typetext);

        Creditlabel=new JLabel("课程学分");
        Creditlabel.setSize(100,30);
        Creditlabel.setLocation(100, 240);
        this.add(Creditlabel);

        Credittext=new JTextField();
        Credittext.setSize(120, 30);
        Credittext.setLocation(220, 240);
        this.add(Credittext);


        Inputlabel=new JLabel("请输入课程名称");
        Inputlabel.setSize(150,50);
        Inputlabel.setLocation(100, 45);
        this.add(Inputlabel);

        Inputtext=new JTextField();
        Inputtext.setSize(160,40);
        Inputtext.setLocation(200, 45);
        this.add(Inputtext);

        Findbt=new JButton("查询");
        Findbt.setSize(90,38);
        Findbt.setLocation(420, 45);
        this.add(Findbt);
        Findbt.addActionListener(this);

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String inputName=Inputtext.getText();

        try {
            Class.forName("org.postgresql.Driver");
            //加载对应的jdbc驱动
            String url="jdbc:postgresql://127.0.0.1:26000/postgres?ApplicationName=app1";
            //配置连接字符串
            String user="jason";//sa超级管理员
            String password="Bigdata@123";//密码
            Connection conn=DriverManager.getConnection(url,user,password);
            //创建数据库连接对象
            Statement st=conn.createStatement();
            //创建SQL语句执行对象

            String  strSQL="(Select* from  course where 课程名称='"+inputName+"' )";
            ResultSet rs=st.executeQuery(strSQL);

            if(rs.next())
            {
                Nametext.setText(rs.getString(1));
                Typetext.setText(rs.getString(2));
                Teachertext.setText(rs.getString(3));
                Credittext.setText(rs.getString(4));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "您查询的课程不存在，请重新输入");
            }
            conn.close();

            //关闭数据库连接
        }
        catch (ClassNotFoundException ex) {
            System.out.println("没有找到对应的数据库驱动类");
        }
        catch (SQLException ex) {
            System.out.println("数据库连接或者是数据库操作失败");
        }

    }

}
