public class Triangle implements IFigure {

    private double height, side1, side2, side3;

    public Triangle(double height, double side1, double side2, double side3) {
        if ((height <= 0) || (side1 <= 0) || (side2 <= 0) || (side3 <= 0)) {
            throw new IllegalFigureParamException("Params cannot be negative or nil!!!!!!!!");
        }

        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateSquare() {
        return height * side1 / 2;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
