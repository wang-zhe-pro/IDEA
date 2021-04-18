package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
public  class DeleteCourse extends JPanel implements ActionListener{
    JLabel Namelabel;
    JTextField Nametext;
    JButton Delbt;
    JTable table;

    public DeleteCourse() {

        this.setSize(650,350);
        this.setLocation(100, 20);
        this.setLayout(null);
        this.setBackground(Color.lightGray);


        Namelabel=new JLabel("请输入退选课程");
        Namelabel.setSize(150,50);
        Namelabel.setLocation(100, 280);
        this.add(Namelabel);

        Nametext=new JTextField();
        Nametext.setSize(160,40);
        Nametext.setLocation(200, 280);
        this.add(Nametext);

        Delbt=new JButton("确认退选");
        Delbt.setSize(90,38);
        Delbt.setLocation(420, 280);
        this.add(Delbt);
        Delbt.addActionListener(this);


        Object[] columnTitle= {"课程名称","授课教师","课程类型","课程学分"};
        //表格行对象数据
        Object[][] tableData= {
                new Object[] {"面向对象Java","必修课","张老师","3分"},
                new Object[] {"面向对象C++","选修课","李老师","2分"},
                new Object[] {"微机原理与接口技术","必修课","王老师","3分"},
                new Object[] {"艺术史","必修课","张老师","4分"},
                new Object[] {"马克思哲学","选修课","胡老师","3分"},
                new Object[] {"大学生物基础","必修课","王老师","2分"},

        };

        //创建表格
        JTable  table=new JTable(tableData,columnTitle);
        JScrollPane scrollpane=new JScrollPane(table);
        scrollpane.setSize(550,150);
        scrollpane.setLocation(60, 20);
        this.add(scrollpane);

        this.setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        String delName=Nametext.getText();

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
            String strSQL="delete from  course where 课程名称='"+delName+"' ";

            int rs=st.executeUpdate(strSQL);
            if(rs==1) {
                JOptionPane.showMessageDialog(null,"课程删除成功");
            }
            else{
                JOptionPane.showMessageDialog(null,"课程删除失败");
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
