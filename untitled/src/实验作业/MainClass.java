//package 实验作业;
//
//import java.util.Scanner;
//public class MainClass {
//    public static Scanner sc=new Scanner(System.in);
//
//
//
//    public static void main(String[] args) {
//        int rowCount,colCount;
//        System.out.println("输入矩阵行列数");
//        rowCount=sc.nextInt();
//        colCount=sc.nextInt();
//
//
//
//        //创建1个rowCount×colCount的矩阵,矩阵所有元素初始化为0
//        Matrix matA=new Matrix(rowCount,colCount);
//        MainClass.inputMatrix(matA);matA
//        System.out.println("矩阵A=\n"+matA);
//        Matrix matB=new Matrix(rowCount,colCount);
//        MainClass.inputMatrix(matB);
//        System.out.println("矩阵B=\n"+matB);
//        System.out.println("运算结果如下:");
//        //执行矩阵相加运算
//        Matrix matC=matA.plus(matB);
//        System.out.println("C=\n"+matC);
//        //修改matA的第2行，第2列的那个元素
//        matA.data[1][1]=89.4;
//        //执行矩阵与一个数相加的运算，即矩阵的所有元素都加上这个数
//        Matrix matD=matA.plus(5.6);
//        System.out.println("D=\n"+matD);
//        //执行矩阵和1个数相乘，即矩阵的所有元素都乘上这个数
//        Matrix matF=matA.multiply(3.4);
//        System.out.println("F=\n"+matF);
//        //求转置矩阵
//        Matrix matG=matA.transpose();
//        System.out.println("G=\n"+matG);
//        //执行矩阵乘法，若matA的列数≠matB的行数，则返回null
//        Matrix matE=matA.multiply(matG);
//        //按[[1,2,3],[4,5,6]]类似格式输出矩阵，这里的逗号都是英文逗号
//        System.out.println("E=\n"+matE);
//        MainClass.sc.close();
//    }
//    private static void inputMatrix(Matrix mat) {
//        int rowCount=mat.getRowCount();
//        int colCount=mat.getColCount();
//
//        System.out.println("输入"+rowCount+"×"+colCount+"矩阵");
//        for(int i=0;i<rowCount;i++) {
//            for(int j=0;j<colCount;j++) {
//                System.out.print("["+i+"]["+j+"]=");
//                mat.data[i][j]=sc.nextDouble();
//            }
//        }
//    }
//}//2 3 1 2 3 4 5 6 8 6 7 5 4 5
