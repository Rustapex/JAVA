package OperatorQ;

import java.util.*;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(sc.nextLine());
            if (number % 2 == 0) {
                sum += number;
            } else continue;
        }
        System.out.println("총 합 : " + sum);
        sc.close();

    }
}
