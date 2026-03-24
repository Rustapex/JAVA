package prac.io.File;

import java.io.FileReader;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) throws IOException {
        FileReader fis = new FileReader("java/d0324/res/acorn.txt");
        int data = fis.read();
        System.out.println((char) data);
        fis.close();
    }
}