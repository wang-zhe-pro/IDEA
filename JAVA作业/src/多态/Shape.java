package 多态;

import java.util.Scanner;

public abstract class Shape {
    public String shapeName;

    public abstract void input(Scanner sc) ;

    public abstract double getPerimeter() ;

    public abstract double getArea() ;

}
