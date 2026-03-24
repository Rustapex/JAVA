package 실기시험손영석.Q2;

import java.util.Scanner;

public class Q2Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int su = sc.nextInt();
        MyClass myClass = new MyClass();
        int result =  myClass.getTotal(su);
        System.out.printf("1부터 %d까지의 합은 %d이다.",su,result);

    }
}
