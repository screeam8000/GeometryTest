public class Rectangle implements IFigure {

    private double wight, height;

    public Rectangle(double wight, double height) {
        if (wight <= 0) {
            throw new IllegalFigureParamException("The Wight param cannot be negative or nil!!!!!!!!");
        }

        if (height <= 0) {
            throw new IllegalFigureParamException("The Height param cannot be negative or nil!!!!!!!!");
        }

        this.wight = wight;
        this.height = height;
    }

    @Override
    public double calculateSquare() {
        return wight * height;
    }

    @Override
    public double calculatePerimeter() {
        return (wight + height) * 2;
    }
}
