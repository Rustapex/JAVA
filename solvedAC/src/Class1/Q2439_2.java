package Class1;

import java.util.Scanner;

public class Q2439_2 {
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

        for (int i = 1; i <= starCnt; i++) {
            for (int j = 1; j <= starCnt; j++) {
                if (j <= starCnt - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();

    }
}
