package 多态;

import java.util.Scanner;

public class Rectangle extends Shape {
    private  double a;
    private  double b;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    Rectangle(){
        super.shapeName="rectangle";
    }
    @Override
    public void input(Scanner sc) {
        System.out.println("input width and weight:");
        a=sc.nextDouble();
        b=sc.nextDouble();
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
