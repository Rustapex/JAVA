package prac.ex;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // InputMismatchException 숫자가 아닌 값 입력하면 프로그램 비정상 종료
        System.out.println("당신이 입력한 숫자는 : " + input);
    }
}
