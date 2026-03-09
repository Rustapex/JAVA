package hardQuest;

import java.util.Scanner;

public class Q3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*배열 없이 약수 출력*/
        int num1 = sc.nextInt();

        {
            for (int i = 2; i <= num1; i++) {
                if (num1 % i == 0) {
                    System.out.printf("%d ", i);
                }
            }
            System.out.println();
        }

        int[] primeN = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        System.out.print("입력할 수의 개수 :");
        int numCnt = sc.nextInt();
        int[] priCnt = new int[numCnt];


        int[][] divisors = new int[numCnt][11];

        for (int i = 0; i < divisors.length; i++) {
            /* index 처음 목록은 입력 수이기에 2번째 부터 소수목록
            * 입력 받기 위해서 */
            int priIndex = 1;
            /*divisors 배열의 첫번째 목록은 입력한 수*/
            divisors[i][0] = sc.nextInt();

            for (int q = 0; q < primeN.length; q++) {
                /*소수 목록의 index에 모두 접근해 소수와 나누어 떨어지면
                * divisors 배열의 2번째 요소부터 소수 목록 저장*/
                if (divisors[i][0] % primeN[q] == 0) {
                    /*나누어 떨어지면 배열에 저장하고
                    * priIndex++ 해서 index 값을 하나 증가시켜
                    * 다음 배열에 다음 소수 저장*/
                    divisors[i][priIndex++] = primeN[q];
                }
                /*소수 목록의 개수를 priCnt[] 배열에 저장*/
                if (q == primeN.length - 1) {
                    priCnt[i] = priIndex;
                }

            }


        }
        for (int i = 0; i < divisors.length; i++) {
            System.out.printf("%d의 소수 약수 %n", divisors[i][0]);
            for (int j = 1; j < priCnt[i]; j++) {
                System.out.printf("%d ", divisors[i][j]);
            }
        }


    }
}
