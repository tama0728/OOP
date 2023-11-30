package Week13;

import java.io.FileReader;
import java.io.IOException;

import static java.lang.Character.toLowerCase;

public class Lower {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/Week13/hello.txt");
        int data;
        while ((data = fr.read()) != -1){
            System.out.println((char)toLowerCase(data));
        }
    }
}
