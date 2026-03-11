package Quest.method;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("약수를 구할 수 :");
        int inputNumber = sc.nextInt();
        int[] divisors = getDivisors(inputNumber);
        if (divisors.length == 0) {
            System.out.println("약수가 너무 많거나 0, 음수를 입력해 프로그램을 종료합니다");
        } else {
            System.out.printf("%d의 약수%n", inputNumber);
            for (int divNumber : divisors) {
                System.out.printf("%d ", divNumber);
            }
        }

        sc.close();


    }

    public static int[] getDivisors(int num) {
        // 음수나 0 입력시 예외
        if (num <= 0) {
            return new int[0];
        }
        // 약수를 임시로 저장할 배열
        int[] divisors = new int[100];

        int divIdx = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                // 약수개수 100초과일 때 예외
                if (divIdx == divisors.length) {
                    return new int[0];
                }
                divisors[divIdx++] = i; // 배열에 넣은 이후 divIdx 값 증가
            }                           // 이후 약수배열의 크기 = divIdx
        }
        // 실제 저장된 개수만큼만 잘라서 반환
        return Arrays.copyOf(divisors, divIdx);
        // 약수만 들어 있는 만큼(divIdx == 약수개수)만 잘라서 반환
        // 그대로 반환하면 뒤에 남은 0도 함께 들어가서 copyOf를 사용
    }
}

