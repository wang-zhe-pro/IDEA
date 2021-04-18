package 实验作业2;
import java.util.Scanner;

public class MainClass {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        Student stu=new Student();

        Teacher.inputInfo(stu,sc);

        stu.updateGrade();

        stu.outputInfo();
        sc.close();
    }

}
