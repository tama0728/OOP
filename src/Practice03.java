import java.util.Scanner;
public class Practice03 {

    public static void main(String[] args){
//        Hello hello = new Hello();
//        hello.sayHello();
        String s1 = "abcda";
        String s2 = "abcdA";
        System.out.println(s1 + s2);
        System.out.printf("s1 length %d\n", s1.length());
        System.out.printf("s2 length %d\n", s2.length());
        System.out.printf("%c\n", s1.charAt(1));
        System.out.printf("equals : %s\n", s1.equals(s2));
        System.out.printf("compareTo : %s\n", s1.compareTo(s2));
        System.out.printf("compareTo : %s\n", s1.compareToIgnoreCase(s2));

        String fileName = "    java.cpp";
        System.out.printf("%s\n", fileName.endsWith(".cpp"));
        System.out.printf("%s\n", fileName.endsWith(".jpg"));
        System.out.printf("%s\n", fileName.trim());

        StringBuffer sb = new StringBuffer("korea");
        sb.append("n kim");
        System.out.println(sb);
        sb.delete(6, 9);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);

        var ss = "asd 123 asdf";
        Scanner sc1 = new Scanner(ss);
        System.out.printf("%s %d %s\n", sc1.next(), sc1.nextInt(), sc1.next());

        String[] browser1 = {"Google Chrome", "Microsoft Edge", "Mozilla Firefox", "Naver Whale"};
        String[] browser2 = new String[4];
        browser2[0] = "Google Chrome";
        browser2[1] = "Microsoft Edge";
        browser2[2] = "Mozilla Firefox";
        browser2[3] = "Naver Whale";

        for (int i = 0; i < 4; i++){
            System.out.printf("browser 1 : %s    \tbrowser 2 : %s    \t length : %d\n", browser1[i], browser2[i], browser1[i].length());
        }
    }
    static class Add {
        void sum(int a, int b) {
            System.out.println(a + b);
        }
    }

    static class Hello{
        void sayHello() {
            System.out.println("hello");
        }
    }

}
