package prac.io.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("java/d0324/res/acorn.txt"));

        String data = bf.readLine();
        System.out.println(data);
        data = bf.readLine();
        System.out.println(data);
        data = bf.readLine();
        System.out.println(data);
    }
}
