public class circle extends hinh {

    private double r;

    public circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public void zoom(double ratio) {
        r *= ratio;
    }

    @Override
    public String toString() {
        return "Circle: Tam (" + x + ", " + y + "), Ban kinh = " + r;
    }
}