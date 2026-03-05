package OperatorQ;
import java.util.*;
/*
* 구구단을 단보다 곱하는 수가 작거나 같은경우까지만 출력하는 프로그램을 작성하시오
   ( 3단
    3*1=3
    3*2=6
    3*3 =9

   4단
   4*1 =4
   4*2 =8
   4*3 =12
   4*4 =16 */

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = Integer.parseInt(sc.nextLine());

        System.out.println(dan +"단");
        for(int i=1; i<=dan; i++ ) {
            System.out.printf("%d * %d = %d\n", dan, i, dan*i);
        }
        sc.close();
    }
}
