package hardQuest;

import java.util.Scanner;

public class Q3_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      약수를 구할 정수 입력받기
        System.out.print("약수를 구할 수 :");
        int numCnt = sc.nextInt();

//      divisors 배열 : numCnt의 약수를 저장할 배열
//      여기서는 최대 100개까지 저장할 수 있도록 크기를 100으로 만듦
        int[] divisors = new int[100];

//      divIdx : 현재까지 저장된 약수의 개수
//      동시에 divisors 배열에 값을 저장할 인덱스 역할도 함
        int divIdx = 0;

//      1부터 numCnt까지 반복하면서 약수인지 확인
        for (int i = 1; i <= numCnt; i++) {
//          numCnt를 i로 나누었을 때 나머지가 0이면 i는 numCnt의 약수
            if (numCnt % i == 0) {
//              약수를 divisors 배열에 저장
//              저장한 뒤 divIdx를 1 증가시켜 다음 저장 위치로 이동
                divisors[divIdx++] = i;
            }
        }
//      어떤 수의 약수인지 먼저 출력
        System.out.printf("%d의 약수%n", numCnt);

//      저장된 약수의 개수(divIdx)만큼만 출력
//      배열 전체를 출력하지 않는 이유는 실제 약수가 저장된 부분만 출력하기 위해서
        for (int i = 0; i < divIdx; i++) {
            System.out.print(divisors[i] + " ");
        }


    }
}
