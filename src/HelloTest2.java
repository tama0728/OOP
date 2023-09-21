class Hell {
    void sayHello(){
        System.out.println("hello");
    }
}
public class HelloTest2 {
    public static void main(String[] args){
        Hell h1 = new Hell();
        h1.sayHello();
        Hell h2 = new Hell();
        h2.sayHello();
    }
}
