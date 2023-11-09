package Week10;

public class Circle extends Point {
    private double radius;
    public Circle() {}
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    public double getRadius() { return radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }
    public double getArea() { return Math.PI * radius * radius; }
}
