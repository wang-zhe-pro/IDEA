package FileTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class Earning extends JFrame implements ActionListener {
    TextArea textArea;
    JButton  button1,button2;
    File file1 = new File("E:\\爱思助手\\test.txt");
    FileReader in;
    FileWriter out;
    BufferedReader bin=null;
    BufferedWriter bout=null;
    String nei = "";
    String kong=" ";
    int num=0;

       Earning(){
           super("职工工资表");
           setLayout(null);
           setSize(500,400);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setVisible(true);
           button1=new JButton("修改前");
           button2=new JButton("修改后");
           textArea=new TextArea();
           button1.addActionListener(this);
           button2.addActionListener(this);
           add(button1);
           add(button2);
           add(textArea);
           textArea.setBounds(20,30,300,200);
           button1.setBounds(340,60,100,60);
           button2.setBounds(340,180,100,60);



       }


     public void change(){




         String [][]cun=new String[1000][3];

         try {
             in = new FileReader(file1);
             bin= new BufferedReader(in);

             while ((nei = bin.readLine()) != null) {

                 cun[num]=nei.split(" ");
                 num++;

             }in.close();
             bin.close();
             bout=new BufferedWriter(new FileWriter(file1));
             for (int i=0;i<num;i++){
                 cun[i][1]=Double.toString(Double.parseDouble(cun[i][1])*1.1);
                 String xin=cun[i][0] + kong+cun[i][1]+kong+cun[i][2];
                 bout.write(xin);
                 bout.write("\r\n");



             }




         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }finally {
             try {
                 bout.flush();
                 bout.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }

         }

     }

    @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource()==button1){

               try {
                   in = new FileReader(file1);
                   bin = new BufferedReader(in);

                   while ((nei = bin.readLine()) != null) {

                       textArea.append(nei+"\n");

               }


               } catch (FileNotFoundException fileNotFoundException) {
                   fileNotFoundException.printStackTrace();
               } catch (IOException ioException) {
                   ioException.printStackTrace();
               }
           }
           if(e.getSource()==button2){

               change();

               try {
                   in= new FileReader(file1);
                   bin= new BufferedReader(in);
                   textArea.setText("");
                   while ((nei = bin.readLine()) != null) {

                       textArea.append(nei+"\n");

                   }


               } catch (FileNotFoundException fileNotFoundException) {
                   fileNotFoundException.printStackTrace();
               } catch (IOException ioException) {
                   ioException.printStackTrace();
               }

           }

    }
}