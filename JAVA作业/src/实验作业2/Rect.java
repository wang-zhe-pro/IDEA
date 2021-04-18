package 实验作业2;

import java.util.Scanner;

public class Rect extends Srec {

    Rect(int a,int b,int c){
        super.setX(a);
        super.setY(b);
        super.setZ(c);

    }
   void Volume(){
        int volume=this.getX()*this.getY()*this.getZ();
       System.out.println(volume);
   }
    void Show(){
        System.out.printf("长为：%d,宽为：%d，高为：%d",this.getX(),this.getY(),this.getZ());
        System.out.println();
    }

}
