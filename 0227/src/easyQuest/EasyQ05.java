package easyQuest;
import java.util.Scanner;

public class EasyQ05 {
//    1000개의 수를 읽어 평균을 계산하여 합과 평균을 출력
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int SIZE = 1000;

    int avg;
    long sum = 0;
    int i;

    for (i =0; i< SIZE; i++){
        sum += sc.nextInt();
    }
    avg = (int)(sum / SIZE);

    System.out.println("합은 : " + sum + " 평균은 " + avg);

    sc.close();

}

}
