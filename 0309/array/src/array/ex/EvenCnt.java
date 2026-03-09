package array.ex;

import java.util.Scanner;

public class EvenCnt {
    public static void main(String[] args) {
        int[] number = new int[5];
        int evenCnt=0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i< number.length; i++){
            number[i] = sc.nextInt();
        }
        for(int i=0; i<number.length; i++){
            if(number[i] %2 ==0){
                evenCnt++;
            }
        }


    }
}
