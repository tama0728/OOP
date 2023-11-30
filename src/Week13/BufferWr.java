package Week13;

import java.io.*;

public class BufferWr {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("src/Week13/travle.txt");
        BufferedWriter bf = new BufferedWriter(f);
        bf.write("""
                I love to travel.
                The cities I have visited:
                \t- Seoul
                \t- New York
                \t- Sydney""");
        bf.close();
        f.close();
    }
}
