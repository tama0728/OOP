package Week10;

public class TestCirclehasAPoint {
    public static void main(String[] args) {
        CirclehasAPoint c = new CirclehasAPoint(25, 78, 5);
        System.out.println("원점: " + c.getCenter());
        System.out.printf("반지름: %.2f\n", c.getRadius());
        System.out.printf("둘레: %.2f\n", c.getCircumference());
        System.out.printf("넓이: %.2f\n", c.getArea());
    }
}
