package 多态;

import java.util.Scanner;

public class Triangle extends Shape {
    double a;
    double b;
    double c;
    Triangle(){
        super.shapeName="triangle";
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public void input(Scanner sc) {
        System.out.println("input length of three sides:");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public double getArea() {
        double p=(a+b+c)/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
