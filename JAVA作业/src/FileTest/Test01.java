package FileTest;

import java.awt.*;
import java.io.*;

public class Test01 {
    public static void main(String[] args) {


        try {

            File file1=new File("D:\\Java\\最近作业\\untitled\\src\\FileTest\\hi.txt");
            FileReader read=new FileReader(file1);
            BufferedReader Buread=new BufferedReader(read);
            String a=null;
            while ((a=Buread.readLine())!=null){
                System.out.println(a);

            }
            read.close();
            Buread.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
