package Class1;

import java.util.Scanner;

public class Q2562 {
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


    }
    public static int[] findMaxInfo(int[] numArr){
        int maxVal = numArr[0];
        int maxIdx = 0;
        for (int i=0; i< numArr.length; i++) {
            if(maxVal < numArr[i]) {
                maxVal = numArr[i];
                maxIdx =i;
            }
        }

        return new int[]{maxVal,maxIdx+1};
        // int[] maxInfo = {maxValue, maxIdx+1};
        /*문제 요청 사항 : 최댓값인 값의 순서를 출력 -> 그래서 index에서 1 더함.*/


    }

}
