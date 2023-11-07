import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sit = sc.nextLine();
        switch (sit){
            case "economy":
                System.out.print("9000"); break;
            case "standard":
                System.out.print("10000"); break;
            case "prime":
                System.out.print("11000"); break;
            default:
                System.out.print("Wrong"); break;
        }
    }
}
