import java.util.Scanner;

public class Homewwork3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int i = sc.nextInt();
        System.out.print("수를 입력하세요: ");
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = sc.nextInt();
        }
        int min = arr[0], max = arr[0];

        for (int j = 1; j < i; j++){
            if (min > arr[j])
                min = arr[j];
            if (max < arr[j])
                max = arr[j];
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

}
