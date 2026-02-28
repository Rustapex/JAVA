package easyQuest;

import java.util.Scanner;

public class EasyQ03 {
//    100개의 수가 입력될 때 양수의 개수와 음수의 개수를 구하고 양수 중에서 홀수와 짝
//      의 개수도 구하시오 (0입력 없음)
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 5;

        int posCnt =0, negCnt=0, posEvCnt =0, posOdCnt=0;
        int num;

        for(int i=0; i<SIZE; i++){
            num = sc.nextInt();
            if(num >0){
                posCnt++;
                if(num%2==0){posEvCnt++;}
                else{posOdCnt++;}
            }
            else{
                negCnt++;
            }
        }
        System.out.println("양수의 개수는 : " + posCnt + " 음수의 개수는 : " + negCnt);
        System.out.println("홀수의 개수는 : " + posOdCnt + " 짝수의 개수는 : " + posEvCnt);

        sc.close();

    }
}
