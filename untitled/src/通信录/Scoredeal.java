package 通信录;

import java.util.Scanner;

public class Scoredeal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Students[] a=new Students[10];
        System.out.println("请输入学生人数");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            String name=input.next();
            int score=input.nextInt();
            a[i]=new Students(name,score);
        }
        judge(a,n);
        System.out.println("请输入要找的学生的姓名：");
        String name1=input.next();
        search(a,n,name1);
    }
    public static void judge(Students[]a,int n){
        int max=a[0].score;
        int min=a[0].score;
        int minindex=0;
        int maxindex=0;
        for(int i=0;i<n;i++)
            if(a[i].score>max){
                max=a[i].score;
                maxindex=i;
            }
        for(int i=0;i<n;i++)
            if(a[i].score<min){
                min=a[i].score;
                minindex=i;
            }
        System.out.println("最低分的姓名和分数："+a[minindex].name+" "+a[minindex].score
        );
        System.out.println("最高分的姓名和分数："+a[maxindex].name+" "+a[maxindex].score);
    }
    public static void search(Students[]a,int n,String name){
        for(int i=0;i<n;i++){
            if(a[i].name.equals(name)){
                System.out.println("该学生的成绩："+a[i].score);
            }
        }
        System.out.println("该学生不存在请重新输入");
    }
}
