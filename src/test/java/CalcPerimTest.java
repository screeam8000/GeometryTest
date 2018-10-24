import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.PI;

public class CalcPerimTest {

    @Test
    public void testCirclePerim () {
        Assert.assertEquals(2*3.1415*16, Circle.calculatePerimeter(16),0.002);
    }

    @Test
    public void testTrianglePerim () {
        Assert.assertEquals(3+5+8, Triangle.calculatePerimeter(3, 5, 8),0.002);
    }

    @Test
    public void testRectanglePerim () {
        Assert.assertEquals((10+7)*2, Rectangle.calculatePerimeter(10, 7),0.002);
    }

}
