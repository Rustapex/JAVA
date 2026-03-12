package Quest.method;
/* 7. 수목록(배열)을 주면 평균을 반환하는 함수 만들기 */

public class Q7 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.printf("평균 : %.3f", getAverage(numbers) );


    }

    public static double getAverage(int[] numArr) {
        int sum = 0;
        for (int i : numArr) {
            sum += i;
        }
        return (double) sum / numArr.length;
    }
}
