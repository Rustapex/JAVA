package Class1;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int starCnt = sc.nextInt();
        /* i=0 j=4 , i=1 j=3 j=4
         *   0 1 2 3 4
         * 0         *
         * 1       * *
         * 2
         * 3
         * 4*/

        for (int i = 0; i < starCnt; i++) {
            for (int j = i; j <starCnt-1; j++) {
                System.out.print(" ");
            }
            for(int q= starCnt-1-i; q<starCnt; q++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
