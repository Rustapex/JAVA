package com.acorn.sys;

import java.util.Scanner;

public class MyLibSys {

	/*
	 9개의 숫자 입력 받기
	 그 숫자들 중 최댓값 구하기
	 최댓값과 몇번 째 숫자가 최댓값인지 출력하기
	 */




    public static void FindMax() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        int[] maxInfo = findMaxInfo(numbers);


        System.out.printf("최댓값은 : %d, 최댓값은 %d번째 입력한 위치에 있습니다.",maxInfo[0],maxInfo[1]);

        sc.close();
        return;


    }
    public static int[] findMaxInfo(int[] numbers){
        int maxVal = getMaxValue(numbers);
        int maxIdx = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == maxVal){
                maxIdx =i;
                break;
            }
        }

        return new int[]{maxVal,maxIdx+1};
        // int[] maxInfo = {maxValue, maxIdx+1};
        /*문제 요청 사항 : 최댓값인 값의 순서를 출력 -> 그래서 index에서 1 더함.*/


    }
    public static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for (int i : numbers) {
            if(maxValue <i){
                maxValue =i;
            }
        }
        return maxValue;
    }






}
