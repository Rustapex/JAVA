package Quest.method;
/*수목록(배열)을 입력으로 받아 가장 큰값을 반환하는 함수 만들기
( 수 중에서 가장 큰값을 찾아주는 함수) */

public class Q6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};


        for(int i=0;i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.printf("%n최댓값출력%n");
        System.out.printf("최댓값 : %d%n", getMaxValue(numbers));
    }

    public static int getMaxValue(int[] arr){
        int maxResult = arr[0];
        for (int i : arr) {
            if(maxResult < i ){
                maxResult = i;
            }
        }
        return maxResult;
    }

}
