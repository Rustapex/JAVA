package Class1;

import java.util.Scanner;

public class Q2562_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        int[] maxInfo = findMaxInfo(numbers);


        for (int max : maxInfo) {
            System.out.println(max);
        }

        sc.close();


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
