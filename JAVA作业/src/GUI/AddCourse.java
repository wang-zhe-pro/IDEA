package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public  class AddCourse extends JPanel implements ActionListener{
    JLabel Namelabel;
    JLabel Typelabel;
    JLabel Teacherlabel;
    JLabel Creditlabel;
    JTextField Nametext;
    JTextField Teachertext;
    JTextField Credittext;
    JComboBox<String> Typecom;
    JButton Addbt;
    JScrollPane scrollpane;
    JTable table;


    public AddCourse() {
        this.setSize(650,350);
        this.setLocation(100, 20);
        this.setLayout(null);
        this.setBackground(Color.lightGray);


        Namelabel=new JLabel("请输入课程名称");
        Namelabel.setSize(100,30);
        Namelabel.setLocation(60, 20);

        this.add(Namelabel);

        Nametext=new JTextField();
        Nametext.setSize(120,30);
        Nametext.setLocation(180, 20);
        this.add(Nametext);

        Teacherlabel=new JLabel("请输入授课教师");
        Teacherlabel.setSize(100,30);
        Teacherlabel.setLocation(60, 60);
        this.add(Teacherlabel);

        Teachertext=new JTextField();
        Teachertext.setSize(120,30);
        Teachertext.setLocation(180, 60);
        this.add(Teachertext);

        Typelabel=new JLabel("请选择课程类型");
        Typelabel.setSize(100,30);
        Typelabel.setLocation(60, 100);
        this.add(Typelabel);

        Typecom=new JComboBox<String>();
        Typecom.setSize(120,30);
        Typecom.setLocation(180, 100);
        Typecom.addItem("必修课");
        Typecom.addItem("选修课");
        this.add(Typecom);

        Addbt=new JButton("添加");
        Addbt.setSize(80,30);
        Addbt.setLocation(350, 80);
        this.add(Addbt);
        Addbt.addActionListener(this);


        Creditlabel=new JLabel("请输入课程学分");
        Creditlabel.setSize(100,30);
        Creditlabel.setLocation(60, 140);
        this.add(Creditlabel);

        Credittext=new JTextField();
        Credittext.setSize(120,30);
        Credittext.setLocation(180, 140);
        this.add(Credittext);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String addName=Nametext.getText();
        String addType=(String) Typecom.getSelectedItem();
        String addTeacher=Teachertext.getText();
        String addCredit=Credittext.getText();

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

            String  strSQL="insert into course values('"+addName+"','"+addType+"','"+addTeacher+"','"+addCredit+"')";
            String  strSQL1="(Select* from   course  where 课程名称='"+addName+"' )";



            if(!addName.trim().equals("")&&!addTeacher.trim().equals("")&&!addCredit.trim().equals(""))
            {
                ResultSet rs1=st.executeQuery(strSQL1);

                if(rs1.next())
                {
                    JOptionPane.showMessageDialog(null,"该课程已存在");     }
                else {
                    int rs=st.executeUpdate(strSQL);

                    if(rs==1) {
                        JOptionPane.showMessageDialog(null,"课程添加成功");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"课程添加失败");
                    }
                }
            }
            else
            { JOptionPane.showMessageDialog(null,"请输入课程信息");
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
