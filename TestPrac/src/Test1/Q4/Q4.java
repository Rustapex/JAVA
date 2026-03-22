package Test1.Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] studentGrade = new int[3][2];
        int[] sum = {0, 0, 0};
        double[] avg = new double[3];


        for (int i = 0; i < studentGrade.length; i++) {
            for (int j = 0; j < studentGrade[i].length; j++) {
                studentGrade[i][j] = sc.nextInt();
                sum[i] += studentGrade[i][j];
            }
            avg[i] = sum[i] / (double) studentGrade[i].length;
        }

        double maxAvg = avg[0];
        int maxIdx = 0;
        for (int i = 0; i < sum.length; i++) {
            System.out.printf("%d번 학생 총점 : %d%n", (i + 1), sum[i]);
            System.out.printf("%d번 학생 평균 : %.1f%n", (i + 1), avg[i]);
            if (maxAvg <= avg[i]) {
                maxIdx = i;
                maxAvg = avg[i];
            }
        }

        System.out.printf("최고 평균 학생 : %d번 학생%n", (maxIdx+1));

    }
}
