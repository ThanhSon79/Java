public abstract class hinh implements shape {

    protected double x;
    protected double y;

    public hinh(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double distance(shape s) {
        hinh h = (hinh) s;

        double dx = x - h.x;
        double dy = y - h.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void rotate(double angle) {
    }

    @Override
    public abstract double area();

    @Override
    public abstract double perimeter();

    @Override
    public abstract void zoom(double ratio);
}
