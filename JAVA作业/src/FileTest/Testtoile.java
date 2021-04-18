package FileTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testtoile {
    public static void main(String[] args) {

     Testtoile a=new Testtoile();

        class Testfile extends JFrame implements ActionListener {

            Button buttonopen;
            Button buttonsave;
            TextArea textArea;
            FileDialog op,sa;

            Testfile(){

                setVisible(true);
                setLayout(null);
                setSize(600,300);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                buttonsave=new Button("open");
                buttonopen=new Button("save");
                textArea =new TextArea("");

                buttonopen.addActionListener(this);
                buttonsave.addActionListener(this);
                add(buttonsave);
                add(buttonopen);
                add(textArea);
                textArea.setBounds(30,40,400,200);
                buttonopen.setBounds(450,60,50,30);
                buttonsave.setBounds(450,180,50,30);
            }





            public  void actionPerformed(ActionEvent e) {
            }
    }
}




    }






