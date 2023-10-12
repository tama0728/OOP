import java.util.Scanner;
import java.awt.Point;

class PrintName {
    String name;

    void setName(String nm) {
        name = nm;
    }

    void printName() {
        printString(name);
    }

    void printString(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        PrintName pn = new PrintName();
        pn.setName("dong yun");
        pn.printName();
    }
}

class function {
    void sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 6, 7};
        function fn = new function();
        fn.sumOfArray(arr);
    }
}

class checkNum {
    Scanner sc = new Scanner(System.in);

    int num;

    void setNum() {
        num = sc.nextInt();
    }

    boolean checkNum(int a, int b) {
        return a <= num && num <= b;
    }

    boolean lowerThan(int n) { return num <= n; }
    void printNum() {
        System.out.println(num);
    }

    void sumNum() {
        int tmp = sc.nextInt();
        if (tmp > 100) {
            num += tmp;
            printNum();
        }
        else if (tmp > 50) printNum();
    }

    public static void main(String[] args) {
        checkNum cn = new checkNum();
        cn.setNum();
        if (cn.checkNum(1, 100)) cn.printNum();
        else System.out.println("1 ~ 100 범위 밖의 정수가 입력되었습니다.");
//        cn.setNum();
        if (cn.lowerThan(10)) cn.printNum();
        else System.out.println("10 초과의 정수가 입력되었습니다.");
        cn.sumNum();
    }
}

class swap {

    static void swap(Point a1, Point a2) {
        Point temp = new Point(a1.x, a1.y);
        a1.x = a2.x;
        a1.y = a2.y;
        a2.x = temp.x;
        a2.y = temp.y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);

        swap(p1, p2);

        System.out.println("1 " + p1.toString());
        System.out.println("2 " + p2.toString());
    }
}

class Number {
    int add(int a, int b)
    {
        return a + b;
    }
    float add(float a, float b)
    {
        return a + b;
    }
}

class TestNumber2 {
    public static void main(String[] args) {
        Number number = new Number();
        int sumInt = number.add(2, 3);
        System.out.printf("2 + 3 = %d\n", sumInt);
        float sumFloat = number.add(2.0f, 3.0f);
        System.out.printf("2 + 3 = %f\n", sumFloat);
        double sumDouble = number.add(2.0f, 3.0f);
        System.out.printf("2 + 3 = %f\n", sumFloat);
    }
}

class Add {
    String add(String s1, String s2) {
        return s1 + ' ' + s2;
    }
    int add(int a, int b) { return a + b ;}
    double add(double a, double b) { return a + b; }

    public static void main(String[] args) {
        Add a = new Add();
        String newStr = a.add("hello", "world");
        int sumInt = a.add(5, 7);
        double sumD = a.add(5.1, 7.2);
        System.out.println(newStr);
        System.out.println(sumInt);
        System.out.println(sumD);
    }
}

class rec {
    long rec(int n) {
        if ( n == 1 ) return 1;
        return n + rec(n - 1);
    }

    public static void main(String[] args) {
        rec rec = new rec();
        System.out.println(rec.rec(100));
    }
}

