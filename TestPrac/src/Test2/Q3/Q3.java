package Test2.Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();
        int[] divisor = new int[inputNum];
        int divCnt=0;

        for(int i=1; i<=inputNum; i++){
            if(inputNum % i == 0){
                divisor[divCnt++] = i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.printf("%d의 약수의 개수 : %d%n", inputNum, divCnt);
        sc.close();
    }
}
