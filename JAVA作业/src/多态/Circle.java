package 多态;

import java.util.Scanner;

public class Circle extends Shape {
    private double r;
    Circle(){
        super.shapeName="circle";
    }
    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r=r;
    }

    @Override
    public void input(Scanner sc) {
        System.out.println("input radius");
        r=sc.nextDouble();

    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }
}
