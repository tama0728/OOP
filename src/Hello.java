import java.util.Scanner;

public class Hello {
    //print hello world
    public static void hello() {
        System.out.println("hello world!");
        Scanner sc = new Scanner(System.in);

        var line = sc.nextLine();

        System.out.printf("%s", line);
    }
}
