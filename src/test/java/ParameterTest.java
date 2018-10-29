import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.Math.PI;

@RunWith(Parameterized.class)
public class ParameterTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {9, 12}, {PI*2*14, 14}, {PI * 4, 2}});
    }

    @Parameterized.Parameter
    public double perimeter;
    @Parameterized.Parameter(1)
    public double r;

    @Test
    public void testParams() {
        Assert.assertEquals(perimeter, new Circle(r).calculatePerimeter(), 1);

    }
}
