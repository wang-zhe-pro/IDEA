package 异常处理综合应用;

import java.util.Scanner;

public class Rectangle implements IShape{
    double a,b;
    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public void input(Scanner sc) throws ShapeException {
          a=sc.nextDouble();
          b=sc.nextDouble();
          if(a<0||b<0){
              throw  new ShapeException();
          }
    }
}
