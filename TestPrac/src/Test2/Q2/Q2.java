package Test2.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] evenArr = new int[10];
        int evenCnt =0;
        int evenSum =0;


        while(evenCnt <10){
            int isEven = sc.nextInt();
            if (isEven ==0){
                break;
            }
            if(isEven %2 ==0){
                evenArr[evenCnt++] = isEven;
                evenSum += isEven;
            }
        }
        for(int i=0; i<evenCnt; i++){
            System.out.print(evenArr[i] + " ");
        }
        System.out.printf("짝수의 합 : %d",evenSum);
        sc.close();
    }
}
