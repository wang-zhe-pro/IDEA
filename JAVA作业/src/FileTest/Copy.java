package FileTest;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
        File sour=new File("E:/迅雷下载/test/test.txt");
        File dest=new File("E:/迅雷云盘/HI");
        FileInputStream in;
        FileOutputStream out;

        if(!dest.exists()){
            dest.mkdirs();
        }

        {
            try {
                in = new FileInputStream(sour);
                out=new FileOutputStream(dest.getAbsolutePath()+sour.getAbsolutePath().substring(sour.getAbsolutePath().lastIndexOf("\\"),sour.getAbsolutePath().length()));
                BufferedInputStream Bin=new BufferedInputStream(in,1024*1024);
                BufferedOutputStream Bout=new BufferedOutputStream(out,1024*1024);
                byte[]a=new byte[1024*1024];
                int len=0;
               while ((len=Bin.read(a))>0){
                   Bout.write(a,0,len);

                   out.close();
                   Bout.close();
               }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    }







}
