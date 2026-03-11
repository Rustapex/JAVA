package Quest.method;

public class Q1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.printf("짝수의 개수는 : %d", evenNum(numbers));


    }
    public static int evenNum(int[] arr){
        int evenCnt =0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenCnt++;
            }
        }
        return evenCnt;
    }

}
