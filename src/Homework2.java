import java.util.Scanner;

class Student {
    private String name, major;
    private int id, tel;
    void setId(int id){ this.id = id;}
    void setName(String name){ this.name = name;}
    void setMajor(String major){ this.major = major;}
    void setTel(int tel){ this.tel = tel;}

    String getName(){ return name;}
    String getMajor(){ return major;}
    String getId(){ return Integer.toString(id);}
    String getTel() {
        String temp = Integer.toString(tel);
        return '0' + temp.substring(0, 2) + '-' + temp.substring(2, 6) + '-' + temp.substring(6);
    }
}
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            int tel = sc.nextInt();

            students[i].setId(id);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setTel(tel);
        }
        System.out.print("\n입력된 학생들의 정보는 다음과 같습니다.\n");
        System.out.printf("첫번쩨 학생: %s %s %s %s\n", students[0].getId(), students[0].getName(), students[0].getMajor(), students[0].getTel());
        System.out.printf("두번쩨 학생: %s %s %s %s\n", students[1].getId(), students[1].getName(), students[1].getMajor(), students[1].getTel());
        System.out.printf("세번쩨 학생: %s %s %s %s\n", students[2].getId(), students[2].getName(), students[2].getMajor(), students[2].getTel());
    }
}
