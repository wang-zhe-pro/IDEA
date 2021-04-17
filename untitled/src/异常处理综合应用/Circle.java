package 异常处理综合应用;

import java.util.Scanner;

public class Circle implements  IShape{
    double r;

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*r;
    }

    @Override
    public void input(Scanner sc) throws ShapeException {
           r=sc.nextDouble();
           if(r<0){
               throw  new ShapeException();
           }

   }
}
