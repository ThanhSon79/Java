public class point extends hinh {

    public point(double x, double y) {
        super(x, y);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public void zoom(double ratio) {
        x *= ratio;
        y *= ratio;
    }

    @Override
    public String toString() {
        return "Point: (" + x + ", " + y + ")";
    }
}
