package hardQuest;

import java.util.Scanner;

public class Q3_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("약수를 구할 수 :");
        int numCnt = sc.nextInt();
        int[] divisors = new int[100];
        int divIdx =0;

        for(int i=1; i<=numCnt; i++){
            if(numCnt %i ==0){
                divisors[divIdx++] = i;
            }
        }
        System.out.printf("%d의 약수%n", numCnt);
        for(int i=0; i<divIdx; i++){
            System.out.print(divisors[i] + " ");
        }





    }
}
