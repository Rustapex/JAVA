package prac.io.File;

import java.io.FileReader;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) throws IOException {

        FileReader fis = new FileReader("java/d0324/res/acorn.txt");
        while(true){
            int data = fis.read();
            System.out.println((char)data);

            if(data == -1){ //아스키코드 값이 -1이면 (파일의 끝)
                break;
            }
            System.out.println((char)data);
        }

    }
}
