package Week10;

public class Course {
    protected String code;
    protected String name;

    public Course() {}
    public Course(String code, String name) {
        this.code = code; this.name = name;
    }
    public String getCode() { return code; }
    public String getName() { return name; }
}
