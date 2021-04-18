package 异常处理综合应用;

public class Cylinder {
    IShape bottom;
    double height;
    public Cylinder(IShape bottom, double height) {
       this.bottom=bottom;
       this.height=height;
    }

    public double getSurfaceArea() {
    return bottom.getPerimeter()*this.height+2*bottom.getArea() ;}

    public double getVolume() {
    return bottom.getArea()*this.height;}
}
