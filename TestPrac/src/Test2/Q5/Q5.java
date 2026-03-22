package Test2.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printStar1(n);


        System.out.println("========================");

        printStar2(n);

    }
    public static void printStar1(int starCnt){
        for(int i=0; i<starCnt ;i++){
            for(int j=0; j<(2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printStar2(int starCnt){
        /*0 1 2 3 4 5 6
        0       *
        1     * * *
        2   * * * * *
        3 * * * * * * *
        0   * * * * *
        1     * * *
        2       *
        */
        for(int i=0; i<starCnt; i++){
            for(int z=0; z<(starCnt-i-1); z++ ){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<starCnt; i++){
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for(int j=(2*(starCnt-i)-1) ; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
