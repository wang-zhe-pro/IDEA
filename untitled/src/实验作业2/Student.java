package 实验作业2;
import java.text.DecimalFormat;
public class Student {
    String 学号;
    String 姓名;
    double  平时成绩;
    double  实验成绩;
    double  期末考试;
    double  总评;
    String  grade;

    void   updateGrade() {
        总评=平时成绩*0.3+实验成绩*0.3+期末考试*0.4;
        if(总评>=90)
            grade="A";
        else if(总评>=80&&总评<90)
            grade="B";
        else if(总评>=70&&总评<80)
            grade="C";
        else if(总评>=60&&总评<70)
            grade="D";
        else
            grade="E";



    }


    public void outputInfo() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("学号=姓名=平时成绩=实验成绩=期末考试="+
                姓名+"("+学号+")"+"的课程"+"\"Java面向对象程序设计\"的成绩评定如下:");
        System.out.println("平时成绩:"+df.format(平时成绩));
        System.out.println("实验成绩:"+df.format(实验成绩));
        System.out.println("期末考试:"+df.format(期末考试));
        System.out.println("总评:"+df.format(总评)+",等级:"+grade);


    }
}