package Week11;

public class TestAbstractShape {
    public static void main (String[] args) {
        ARectangle r = new ARectangle(10, 20);
        ACircle c = new ACircle(10);
        System.out.println("rectangle area: " + r.getArea());
        System.out.println("rectangle perimeter: " + r.getPerimeter());
        System.out.println("circle area: " + c.getArea());
        System.out.println("circle perimeter: " + c.getPerimeter());


    }
}
