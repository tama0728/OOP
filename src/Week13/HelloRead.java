package Week13;

import java.io.*;
import java.util.Scanner;

public class HelloRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream("src/Week13/hello.txt");

        int data;
        byte[] b = new byte[4];
        while ((data = fs.read(b)) != -1) {
            System.out.println((char) data);
        }
        fs.close();

        FileReader fr = new FileReader("src/Week13/hello.txt");

        int data2;
        while ((data2 = fr.read()) != -1) {
            System.out.println((char) data2);
        }
        fs.close();

        BufferedReader br = new BufferedReader(new FileReader("src/Week13/hello.txt"));
        int data3;
        while ((data3 = br.read()) != -1) System.out.println((char)data3);
    }
}
