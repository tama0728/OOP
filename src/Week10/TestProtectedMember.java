package Week10;

public class TestProtectedMember {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(20.0, 10.0);
        System.out.println(myRect.height);
        Pyramid p = new Pyramid();
        p.printHeight();
    }
}
