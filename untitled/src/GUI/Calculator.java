package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    String s1="0";
    String s2="0";
    JFrame jf;
    JTextField textField1,textField2,textField3;
    JButton button1,button2,button3;
    JLabel label1,label2,label3,label4;
    public Calculator(){

        jf=new JFrame();
        jf.setLayout(new GridLayout(2,2,3,3));
        jf.setSize(200,100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField1=new JTextField(20);
        textField1.addActionListener(this);
        textField2=new JTextField(20);
        textField2.addActionListener(this);
        textField3=new JTextField(20);
        textField3.addActionListener(this);
        label1=new JLabel("简易计算器");
        label2=new JLabel("运算数1");
        label3=new JLabel("运算数2");
        label4=new JLabel("运算数结果");
        button1=new JButton("相加");
        button1.addActionListener(this);
        button2=new JButton("相减");
        button2.addActionListener(this);
        button3=new JButton("全部清零");
        button3.addActionListener(this);
        jf.getContentPane().add(label1);
        jf.getContentPane().add(label2);
        jf.getContentPane().add(textField1);
        jf.getContentPane().add(label3);
        jf.getContentPane().add(textField2);
        jf.getContentPane().add(label4);
        jf.getContentPane().add(textField3);
        jf.getContentPane().add(button1);
        jf.getContentPane().add(button2);
        jf.getContentPane().add(button3);
        jf.pack();

    }
    public static void main(String[] args) {
        Calculator a=new Calculator();
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
