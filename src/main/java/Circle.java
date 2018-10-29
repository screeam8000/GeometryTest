import static java.lang.Math.PI;

public class Circle implements IFigure {

    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalFigureParamException("The Radius param cannot be negative or nil!!!!!!!!");
        }
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double calculateSquare() {
        return PI * radius * radius;
    }
}
