package 异常处理综合应用;

import java.util.Scanner;

/**
 * @author imagan
 *
 */
public interface IShape {
    /**
     * 求平面图形的面积
     * @return 平面图形的面积
     */
    double getArea();
    /**
     * 求平面图形的周长
     * @return 平面图形的周长
     */
    double getPerimeter();
    /**
     * 从控制台输入平面图形的基本属性，在此基础上可以求面积和周长
     * @param sc  对控制台输入进行扫描的对象
     * @throws ShapeException 当输入的属性值，例如圆的半径为负数或0，则抛出ShapeException异常,另外当一些属性不合法（如三条边不能构成三角形），也抛出异常
     */
    void input(Scanner sc) throws ShapeException;
}
