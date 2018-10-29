public class Rectangle implements Figure {

    private double wight, hight;

    public Rectangle(double wight, double hight) {
        this.wight = wight;
        this.hight = hight;
    }

    @Override
    public double calculateSquare() {
        return wight * hight;
    }

    @Override
    public double calculatePerimeter() {
        return (wight + hight) * 2;
    }
}
