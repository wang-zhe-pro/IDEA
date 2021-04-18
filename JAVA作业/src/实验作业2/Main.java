package 实验作业2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        x=sc.nextInt();
        y= sc.nextInt();
        z= sc.nextInt();
        Rect A=new Rect(x,y,z);
        A.Show();
        A.Volume();


    }
}
