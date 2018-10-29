import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.PI;

public class CalcPerimTest {

    @Test
    public void testCirclePerim () {
        Circle circle = new Circle(16);
        Assert.assertEquals(2*3.1415*16, circle.calculatePerimeter(),0.002);
    }

    @Test
    public void testTrianglePerim () {
        Triangle triangle = new Triangle(9, 12, 14, 10);
        Assert.assertEquals(12+14+10, triangle.calculatePerimeter(),0.002);
    }

    @Test
    public void testRectanglePerim () {
        Rectangle rectangle = new Rectangle(10, 7);
        Assert.assertEquals((10+7)*2, rectangle.calculatePerimeter(),0.002);
    }
}
