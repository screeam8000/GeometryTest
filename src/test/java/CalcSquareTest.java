import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.PI;

public class CalcSquareTest {

    @Test
    public void testCircleSquare () {
        Assert.assertEquals(PI*5*5, Circle.calculateSquare(5),0.002);
    }

    @Test
    public void testTriangleSquare () {
        Assert.assertEquals(9*12/2, Triangle.calculateSquare(9, 12),0.002);
    }

    @Test
    public void testRectangleSquare () {
        Assert.assertEquals(10*2, Rectangle.calculateSquare(10, 2),0.002);
    }
}
