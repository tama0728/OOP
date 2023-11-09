package Week10;

public class Parent {
    private String name;
    public Parent(String name) {
        System.out.println("Parent constructor");
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
}

class Child extends Parent {
    private int value;
    public Child(String name, int value) {
        super(name);
        System.out.println("Child constructor");
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int newValue) {
        this.value = newValue;
    }
}