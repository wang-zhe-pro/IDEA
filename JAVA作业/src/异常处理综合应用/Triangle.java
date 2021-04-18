package 异常处理综合应用;

import java.util.Scanner;

public class Triangle implements IShape {
    double a,b,c;
    @Override
    public double getArea() {
        double p=(a+b+c)/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public void input(Scanner sc) throws ShapeException {
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
      if (a<0||b<0||c<0){
          throw  new ShapeException("不能构成三角形");
      }
      if(a+b<c||a+c<b||b+c<a){
          throw  new ShapeException("不能构成三角形");
      }



    }
}
