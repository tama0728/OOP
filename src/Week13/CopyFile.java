package Week13;

import java.io.*;

public class CopyFile {

    static void copy(InputStream src, OutputStream dst) throws IOException {
        int data;
        while ((data = src.read()) != -1){
            dst.write((char) data);
        }
    }

    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("./src/Week13/hello.txt");
        FileOutputStream f = new FileOutputStream("./src/Week13/hello2.txt");
        copy(fr, f);
        fr.close();
        f.close();
    }
}
