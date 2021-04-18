package FileTest;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class File4
{
    public static void main(String args[])
    { File4Frm frm=new File4Frm();

    }
}
class File4Frm extends Frame implements ActionListener
{
    FileDialog sv,op;
    Button btn1,btn2,btn3;
    TextArea tarea;

    File4Frm()
    {
        super("打开和保存文件");
        setLayout(null);
        setBackground(Color.cyan);
        setSize(600,300);
        setVisible(true);
        btn1=new Button("Open");
        btn2=new Button("Save");
        btn3=new Button("Close");
        tarea=new TextArea("");
        add(btn1); add(btn2); add(btn3); add(tarea);
        tarea.setBounds(30,50,460,220);
        btn1.setBounds(520,60,50,30);
        btn2.setBounds(520,120,50,30);
        btn3.setBounds(520,180,50,30);
        sv=new FileDialog(this,"保存",FileDialog.SAVE);
        op=new FileDialog(this,"打开",FileDialog.LOAD);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            String str;
            op.setVisible(true);
            try
            {
                File fl=new File(op.getDirectory(),op.getFile());
                FileReader fr=new FileReader(fl);
                BufferedReader br = new BufferedReader(fr);
                tarea.setText("");
                while((str=br.readLine())!=null)tarea.append(str+'\n');

                fr.close();
            }
            catch(Exception e1)
            {} }
        if(e.getSource()==btn2)
        {
            sv.setVisible(true);
            try
            {
                File fl=new File(sv.getDirectory(),sv.getFile());
                FileWriter fw=new FileWriter(fl);
                BufferedWriter bw = new BufferedWriter(fw);
                String gt=tarea.getText();
                bw.write(gt,0,gt.length());
                bw.flush();
                fw.close();
            }
            catch(Exception e1)
            {} }
        if(e.getSource()==btn3)
        {
            System.exit(0);
        } } }