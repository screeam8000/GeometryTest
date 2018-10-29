import org.junit.Test;

public class ExceptionTest {

    @Test (expected = IllegalFigureParamException.class)
    public void testExceptionCircle (){
        new Circle(-1).calculatePerimeter();
    }

    @Test (expected = IllegalFigureParamException.class)
    public void testExceptionRectangle (){
        new Rectangle(1, 0).calculatePerimeter();
    }

    @Test (expected = IllegalFigureParamException.class)
    public void testExceptionTriangle (){
        new Triangle(1, 3, 4, 0).calculatePerimeter();
    }
}
