package Test1.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력(대소 판별) :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("max(%d, %d) -> %d%n",a,b,max(a,b));

        System.out.println("수를 입력(짝수 판별) :");
        int c = sc.nextInt();
        System.out.printf("isEven(%d) -> %b%n",c,isEven(c));
        sc.close();
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
