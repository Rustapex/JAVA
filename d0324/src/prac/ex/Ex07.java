package prac.ex;

/*1. throws 사용하기 -> 예외 던지기, 예외 미루기 (main -> 미루기 -> jvm)  :예외 처리를 하지 않고 작성 가능
* 2. */

import java.io.IOException;

public class Ex07 {
    //jvm -> main
    public static void main(String[] args) throws IOException {
        int ch = System.in.read();
        System.out.println(ch); // a-> 97(ASCII)
        System.out.println((char)ch);
        System.out.println("ok");
        /*keyboard로부터 1 byte 읽어오기
        checkedException -> 예외처리를 반드시 해야한다.
        try catch , throws (예외 던지기)르 사용할 수 있다.
            */
    }
}
