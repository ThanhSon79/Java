
public class rectangle extends hinh {

    private double dai;
    private double rong;

    public rectangle(double x, double y, double dai, double rong) {
        super(x, y);
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public double getRong() {
        return rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    @Override
    public double area() {
        return dai * rong;
    }

    @Override
    public double perimeter() {
        return 2 * (dai + rong);
    }

    @Override
    public void zoom(double ratio) {
        dai *= ratio;
        rong *= ratio;
    }

    @Override
    public String toString() {
        return "Rectangle: Tam (" + x + ", " + y
                + "), Dai = " + dai + ", Rong = " + rong;
    }
}