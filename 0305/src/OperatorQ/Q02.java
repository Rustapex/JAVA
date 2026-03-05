package OperatorQ;

public class Q02 {
    /*1~10까지 합 구하기  (for, while문 사용하기)*/
    static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;
        for (int n : numbers) {
            sum1 += n;
        }
        System.out.println("1부터 10까지의 합 : " + sum1);

        // 1 +2(1 * 2 +1)  +3+4(3*2+1) + ... + 9 + 10(9 *2 + 1)
        int i = 1;
        int sum2 = 0;
        while (i < 10) {
            sum2 += i * 2+1;
            i +=2;
        }
        System.out.printf("%s : %d","1부터 10까지의 합", sum2);


    }
}
