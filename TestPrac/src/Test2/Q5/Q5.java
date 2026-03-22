package Test2.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*0 ->1번
        * 1 -> 3번
        * n -> 2n+1*/

        for(int i=0; i<n ;i++){
            for(int j=0; j<(2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================");

        /*0 1 2 3 */
    }
}
