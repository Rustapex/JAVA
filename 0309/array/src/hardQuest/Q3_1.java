package hardQuest;

import java.util.Scanner;

public class Q3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // num 배열 : 입력받을 정수가 들어갈 배열(정수 10개)
        int[] num = new int[10];
//      evenNum 배열 : 짝수가 들어갈 배열(정수 10개가 모두 짝수일 경우 생각 해서 크기 10)
        int[] evenNum = new int[10];
//      evenIndex : 짝수의 개수를 세는 변수 -> 이 변수로 나중에 짝수배열(evenNum)의 인덱스에 접근
        int evenIndex =0;

//      10개의 정수 입력 후 num 배열에 저장
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
//          입력한 값이 짝수이면 evenNum 배열에 앞에서부터 차례대로 저장
//          evenIndex는 현재 저장할 위치를 나타냄
            if(num[i] %2 ==0){
                evenNum[evenIndex++] = num[i];
//              1. 현재 evenIndex 위치에 짝수 값을 저장
//              2. 저장이 끝난 뒤 evenIndex가 1 증가
//              3. 다음 짝수가 나오면 그 다음 인덱스에 저장
//              4. 이 과정을 10개의 숫자를 입력받는 동안 반복

//              예: 처음 짝수는 0번 인덱스에 저장되고,
//              다음 짝수는 1번 인덱스에 저장됨
            }
        }

//      이전에 구했던 짝수 개수만큼만 출력하기(i < evenIndex)
        for(int i=0; i<evenIndex; i++){
//          evenNum의 요소 출력
            System.out.printf("%d ", evenNum[i]);
//          짝수를 한 칸 띄워서 출력
        }
        System.out.println();
        System.out.printf("그리고 짝수의 개수는 %d이고, 홀수는 %d이다.", evenIndex,num.length-evenIndex);


        sc.close();
    }
}
