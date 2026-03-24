package prac.ex;

import java.io.IOException;

public class Ex08 {
    public static void main(String[] args) {
        int su =0;
        try {
            su=System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //예외 발생 여부 무관하게 실행
            System.out.println("무조건 수행");
        }
        System.out.println(su);
    }
}
