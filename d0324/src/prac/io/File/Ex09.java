package prac.io.File;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {
    public static void main(String[] args) {

        try {
            BufferedReader bf = new BufferedReader(new FileReader("res/acorn.txt"));
            while (true) {
                String data = bf.readLine();
                System.out.println(data);
                if (data == null) break;
            }
        } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
            System.out.println("파일이 없다 확인");
        } catch (IOException e) {
//                e.printStackTrace();
//            System.out.println("파일이 없다 확인");
        } finally {
            System.out.println("dddd");
        }


    }
}
