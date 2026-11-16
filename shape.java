public interface shape {
    double area();
    double perimeter();
    double distance(shape s);
    void move(double dx, double dy);
    void rotate(double angle);
    void zoom(double ratio);
}
