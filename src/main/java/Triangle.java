public class Triangle implements Figure {


    private double higth, side1, side2, side3;

    public Triangle(double higth, double side1, double side2, double side3) {
        this.higth = higth;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateSquare()
    {
        return higth*side1/2;
    }

    @Override
    public double calculatePerimeter()
    {
        return side1+side2+side3;
    }
}
