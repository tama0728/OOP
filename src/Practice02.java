import java.util.Scanner;

public class Practice02 {
    public static void Scanner1() {
        Scanner sc = new Scanner(System.in);
        var word = sc.next();
        System.out.println("word : " + word);

        int i = sc.nextInt();
        System.out.println("integer : " + i);
    }

    public static void ReadLine(){
        Scanner sc = new Scanner(System.in);
        var line = sc.nextLine();
        System.out.printf("string : %s", line);
    }

    public static void FahrenheitToCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter fahrenheit : ");
        double fah = sc.nextDouble();
        System.out.printf("Celsius : %.1f", ((double)5 / 9) * (fah - 32));
    }

    public static void Array1() {
        double[] arr1 = {1.1, 2.3, 4.7, 7.5};
        double arr2[] = new double[4];

        arr2[0] = 1.1;
        arr2[1] = 2.3;
        arr2[2] = 4.7;
        arr2[3] = 7.5;

        for (int i = 0; i < 4; i++) {
            System.out.printf("arr1[%d] : %f, arr2[%d] : %f\n", i, arr1[i], i, arr2[i]);
        }
    }
}
