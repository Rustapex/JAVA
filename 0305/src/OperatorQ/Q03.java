package OperatorQ;
import java.util.*;

public class Q03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n까지의 합을 구하기 위해 n 입력: ");
        int num = Integer.parseInt(sc.nextLine());
        long sum=0;

        // 등차수열(첫항 1 공차 1 인 등차수열 합공식)
        /* Sn = (n+1)n / 2
        * */
        sum = (num+1) * (long)num / 2;
        System.out.printf("%s %d %s : %d", "1부터 ", num, "까지의 합", sum);

        sc.close();
    }
}
