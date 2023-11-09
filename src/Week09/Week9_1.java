package Week09;

public class Week9_1 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("김복동", "GB112", "bk32@ac.kr");
        Course oo1 = new Course(lecturer, "GB111");
        Stu s1 = new Stu("202011111", "jsl");
        Stu s2 = new Stu("202011112", "bdk");
        Stu s3 = new Stu("202011112", "cho");

        oo1.enroll(s1);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.enroll(s2);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.enroll(s3);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.drop(s2);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.printEnrolled();
    }
}


/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Course {
    private final static int MAX_STUDENTS = 30;
    private int numEnrolled = 0;
    private Lecturer lecturer;
    private String room;
    private Book ref;
    private Stu[] students = new Stu[MAX_STUDENTS];

    Course(Lecturer lecturer, String room) {
        this.lecturer = lecturer;
        this.room = room;
    }
    public void setRoom(String room) { this.room = room; }
    public void setBook(Book r) { ref = r; }
    public void enroll(Stu s) {
        if (numEnrolled < MAX_STUDENTS) {
            students[numEnrolled] = s;
            numEnrolled++;
        }
    }
    public void drop(Stu s) {
        if (numEnrolled > 0) {
            for (int i = 0; i < students.length; i++) {
                // 검색해서 s를 찾으면 뒤에 있는 요소들을 움직여서 앞으로 채움
                if (students[i] == s) {
                    for (int j = i + 1; j < students.length; j++) {
                        students[j - 1] = students[j];
                    }
                    numEnrolled--;
                    break;
                }
            }
        }
    }
    public int getNumEnrolled() { return numEnrolled; }
    public void printEnrolled() {
        for (int i = 0; i < numEnrolled; i++) {
            System.out.println(students[i]);
        }
    }
}

class Stu {
    private String stNo;
    private String name;
    public Stu(String stNo, String name) {
        this.name = name;
        this.stNo = stNo;
    }
    public String getName() { return name; }
    public String stNo() { return stNo; }
    public String toString() {
        return "Name :" + name + ", Student Number : " + stNo;
    }
}

class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public String getName() { return name; }
    public String getAuthor() { return author; }
}

class Lecturer {
    private String email;
    private String name;
    private String room;

    public Lecturer(String name, String room, String email) {
        this.room = room;
        this.name = name;
        this.email = email;
    }
    public String getEmail() { return email; }
    public String getName() { return name; }
    public String getRoom() { return room; }
}