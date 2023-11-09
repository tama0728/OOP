package Week10;

public class CirclehasAPoint {
    private Point center;
    private double radius;
    public CirclehasAPoint() {}
    public CirclehasAPoint(int x, int y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }
    public Point getCenter() { return center; }
    public double getRadius() { return radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }
    public double getArea() { return Math.PI * radius * radius; }
}
