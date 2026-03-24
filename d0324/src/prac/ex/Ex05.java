package prac.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // InputMismatchException 숫자가 아닌 값 입력하면 프로그램 비정상 종료
        int input =0;
        try{
            System.out.print("숫자 입력");
            input = sc.nextInt();
        } catch(InputMismatchException e){
            System.out.println("숫자로 입력하세요");
        }
        System.out.println("당신이 입력한 숫자 " + input);
        System.out.println("당신이 입력한 숫자는 : " + input);
    }
}
