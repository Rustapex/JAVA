package OperatorQ;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a 입력 :");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("연산자 입력 :");
        String oper = sc.nextLine();

        System.out.print("b 입력 :");
        int b = Integer.parseInt(sc.nextLine());

        double res = 0.0;

        switch (oper) {
            case "*" -> res = a * b;
            case "/" -> res = (double)a / b;
            case "%" -> res = a % b;
            case "-" -> res = a - b;
            case "+" -> res = a + b;
            default -> System.out.println("잘못된 값 입력입니다");
        }
        System.out.printf("%d %s %d = %.3f", a, oper,b, res);


        sc.close();
    }
}
