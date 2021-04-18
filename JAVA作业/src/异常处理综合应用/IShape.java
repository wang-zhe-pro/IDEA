package 异常处理综合应用;

import java.util.Scanner;


public interface IShape {

    double getArea();

    double getPerimeter();

    void input(Scanner sc) throws ShapeException;
}
