import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import static java.lang.Math.PI;

public class CalcSquareTest {

    @Rule
    public SomeRule someRule = new SomeRule();

    @Test
    public void testCircleSquare () {
        Circle circle = new Circle(10);
        Assert.assertEquals(PI*10*10, circle.calculateSquare(), 0.0002);
//        Assert.assertEquals(PI*5*5, Circle.calculateSquare(5),0.002);
    }

    @Test
    public void testTriangleSquare () {
        Triangle triangle = new Triangle(9, 12, 14, 10);
        Assert.assertEquals(9*12/2, triangle.calculateSquare(),0.002);
    }

    @Test
    public void testRectangleSquare () {


        Rectangle rectangle = new Rectangle(10, 2);
        Assert.assertEquals(10*2, rectangle.calculateSquare(),0.002);
    }
}
