package 异常处理综合应用;
import java.io.BufferedReader;
import java.util.Scanner;


import java.util.Scanner;

public class MainClass {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("请输入柱体类型");
        System.out.println("0-圆柱体\n1-三菱柱\n2-长方体");
        IShape bottom = null;
        switch (sc.nextInt()) {


            case 0: bottom =new Circle();break;
            case 1: bottom=new Triangle();break;
            case 2: bottom=new Rectangle();break;


            default :
                System.out.println("暂不支持这种柱体!");
                sc.close();

        }

        System.out.println("请输入该柱体底面属性值:");

        while(true) {
            try {
                bottom.input(sc);
                break;
            }catch(ShapeException exp) {
                System.out.println(exp.getMessage());
                System.out.println("请重新输入属性值:");
            }
        }
        System.out.println("请输入柱体的高度:");
        double height = sc.nextDouble();

        Cylinder cylinder = new Cylinder(bottom, height);
        String s = String.format("体积=%.2f,表面积=%.2f", cylinder.getVolume(),
                cylinder.getSurfaceArea());
        System.out.printf(s);
        sc.close();
    }

}
