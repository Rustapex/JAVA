package Class1;

import java.util.Scanner;

public class Q10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(add(num1,num2));
        System.out.println(minus(num1,num2));
        System.out.println(mul(num1,num2));
        System.out.println(div(num1,num2));
        System.out.print(mod(num1,num2));

    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static int mod(int a, int b){
        return a%b;
    }

}
