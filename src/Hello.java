import java.util.Scanner;

class Hello {
    String name = "kim";

    void setName(String name){
        this.name = name;
    }
    void sayHello(){
        System.out.println("hi hello " + name);
    }
    void print() { this.sayHello(); }
    public static void main(String[] args) {
        Hello h = new Hello();
        h.sayHello();
        h.setName("kaa");
        h.sayHello();
        h.print();
    }
}

