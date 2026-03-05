package OperatorQ;
import java.util.Scanner;

// 연산자를 입력받아
// "+", "-", "*", "/", "%", "=", "<", ">", "!", "&&", "||"
// (해당되면 연산자이다, 연산자가 아니다 출력) 연산자 여부를 출력하는 프로그램을 작성하시오

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String oper = sc.nextLine();

        switch (oper){
            case "+", "-", "*", "/", "%", "=", "<", ">", "!", "&&", "||" -> {
                System.out.println("연산자입니다");
            }
            default -> System.out.println("연산자가 아닙니다");
        }
        sc.close();

    }
}
