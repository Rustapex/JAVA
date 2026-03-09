package hardQuest;

import java.util.Scanner;

public class Q3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int[] evenNum = new int[10];
        int evenIndex =0;

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            if(num[i] %2 ==0){
                evenNum[evenIndex++] = num[i];
            }
        }

        for(int i=0; i<evenIndex; i++){
            System.out.printf("%d ", evenNum[i]);
        }
        System.out.println();
        System.out.printf("그리고 짝수의 개수는 %d이고, 홀수는 %d이다.", evenIndex,num.length-evenIndex);



    }
}
