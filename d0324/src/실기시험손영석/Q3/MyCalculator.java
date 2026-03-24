package 실기시험손영석.Q3;

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

}
