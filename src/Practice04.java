import java.util.Scanner;

class Hello1 {
    String toWhom = "world";

    Hello1() {}
    void setWhom(String whom) {
        toWhom = whom;
    }
    void sayHello() {
        System.out.println("hello " + toWhom);
    }
}

public class Practice04 {
    public static void main(String[] args){
        int Cup1 = 10;
        int Cup2 = 50;
        while (Cup1 < Cup2){
            Cup1 += 10;
        }
        System.out.printf("Cup1 = %d\n", Cup1);
        System.out.printf("Cup2 = %d\n", Cup2);

        for (int i = 10; i <= 59; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
        for (int i = 10; i <= 50; i+=10) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(i + j);
                System.out.print(" ");
            }
        }

        char ch;
        Scanner sc = new Scanner(System.in);
        boolean b = false;
        while (b){
            ch = sc.next().charAt(0);
            if (ch == 'n') break;
            System.out.println(ch);
        }

        int i;
        do {
            i = sc.nextInt();
            if (i == 0) continue;
            System.out.println(i);
        } while (i < 100);

        double[] arr = {1.1, 2.1, 3.4, 2.1, 2};
        for (double a : arr) {
            System.out.println(a);
        }

        Hello1[] arr2 = new Hello1[3];
        for (int j = 0; j < 3; j++) {
            arr2[j] = new Hello1();
        }
        String[] whom = { "ycho", "jsl", "everyone" };
        int index = 0;
        for (Hello1 a : arr2) {
            a.setWhom(whom[index]);
            index++;
        }

        for (Hello1 a : arr2)
            a.sayHello();
    }
}
