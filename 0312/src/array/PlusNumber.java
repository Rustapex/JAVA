package array;

import java.util.Arrays;

public class PlusNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        plusNum(arr, 0,5);
        System.out.printf("index : %d, 증가한 값 : %d%n", 0, 5);
        System.out.println(Arrays.toString(arr));

    }
    public static void plusNum(int[] arr, int index, int plusValue){
        arr[index] += plusValue;
        return;
    }
}
