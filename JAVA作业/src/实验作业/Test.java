package 实验作业;
import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入矩阵A的行列数（空格间隔)");
        int rowNum=sc.nextInt();
        int colNum=sc.nextInt();
        System.out.println("请逐行输入矩阵A的元素值（每输入一行回车一次，同一行相邻元素用空格分隔）");

        double[][] arrA = inputArray(rowNum, colNum);
        System.out.println("请输入矩阵B的行列数（空格间隔)");
        rowNum=sc.nextInt();
        colNum=sc.nextInt();
        System.out.println("请逐行输入矩阵B的元素值（每输入一行回车一次，同一行相邻元素用空格分隔）");
        double[][] arrB = inputArray(rowNum, colNum);

        Matrix matA = new Matrix(arrA);
        Matrix matB = new Matrix(arrB);

        Matrix matC = matA.multiply(matB);

        System.out.println(matC);
        Test.sc.close();
    }


    public static double[][] inputArray(int row, int col) {
        double[][] a = new double[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                a[r][c] = sc.nextDouble();
            }
        }
        return a;
    }

}
