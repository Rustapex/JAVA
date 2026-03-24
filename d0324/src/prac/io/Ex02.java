package prac.io;

import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        System.out.println("알파벳 여러 개 쓰고 엔터");
        int input;
        while((input = System.in.read()) != '\n'){
            System.out.println((char)input);

        }
    }
}
