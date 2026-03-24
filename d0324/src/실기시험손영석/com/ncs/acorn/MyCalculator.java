package 실기시험손영석.com.ncs.acorn;

import java.util.Scanner;

public class MyCalculator {
    public static int mul(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aMulB = a*b;
        sc.close();
        return aMulB;
    }
    public static void mulInfo(){
        System.out.println(mul());
    }
    public static void main(String[] args) {
        mulInfo();
    }
}
