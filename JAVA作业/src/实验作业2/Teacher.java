package 实验作业2;
import java.util.*;

public final class Teacher {

    public static void inputInfo(Student stu, Scanner sc) {
        stu.学号=sc.next();
        stu.姓名=sc.next();
        stu.平时成绩=sc.nextDouble();
        stu.实验成绩=sc.nextDouble();
        stu.期末考试=sc.nextDouble();
    }


}