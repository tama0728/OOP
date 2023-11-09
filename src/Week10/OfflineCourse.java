package Week10;
public class OfflineCourse extends Course{
    public OfflineCourse() {}
    public OfflineCourse(String code, String name) {
        super(code, name);
    }
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}
