package Week11;

public class TestHello {
    public static void main(String[] args) {
        Hello[] h = new Hello[3];
        h[0] = new HelloFrench("d1");
        h[1] = new HelloSpanish("d2");
        h[2] = new HelloKorean("d3");

        for (Hello hello : h) hello.sayHello();
    }
}
