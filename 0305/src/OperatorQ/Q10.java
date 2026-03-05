package OperatorQ;
/*
 *별하나 이용해서 다음과 같이 출력
 ***
 ***
 *
 * 2단 출력

 *  */

public class Q10 {
    static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int dan = 2;

        for (int x = 1; x <= 9; x++) {
            System.out.printf("%d * %d = %d\n", dan, x, dan * x);
        }

    }
}
