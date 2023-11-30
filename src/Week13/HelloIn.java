package Week13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloIn {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream("src/Week13/hello.txt");
        Scanner sc = new Scanner(fs);
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
