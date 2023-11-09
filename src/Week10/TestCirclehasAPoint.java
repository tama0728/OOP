package Week10;

public class TestCirclehasAPoint {
    public static void main(String[] args) {
        CirclehasAPoint c = new CirclehasAPoint(25, 78, 5);
        System.out.println("원점: " + c.getCenter());
        System.out.println("반지름: " + c.getRadius());
        System.out.println("둘레: " + c.getCircumference());
        System.out.println("넓이: " + c.getArea());
    }
}
