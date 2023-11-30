package Week13;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;

public class CircleIn {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream("src/Week13/circle.txt");
        Scanner sc = new Scanner(fs);
        double r = sc.nextDouble();
        double area = r*r*Math.PI;
        System.out.printf("radius : %.2f, area : %.2f\n", r, area);
    }
}
