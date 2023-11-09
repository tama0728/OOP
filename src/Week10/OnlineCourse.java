package Week10;

public class OnlineCourse extends Course{
    public OnlineCourse() {}
    public OnlineCourse(String code, String name) {
        super(code, name);
    }
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}
