package array;

public class ArrayCountEven {
    /*public - 전역 / pirvate - 전역 x*/
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("짝수");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.printf("짝수 개수는 : %d", CountEven(numbers));

    }
    /*public static void hi(){
        System.out.println("hello");  이렇게 하면 나중에 불편함
         반환이 있으면 그냥 값, 또는 배열 등을 반환하고, 반환값이 없으면 매개변수 조작을 진행
         출력은 따로 main에서 아니면 출력만 구분해서 method 작성
    }*/
    public static int CountEven(int[] nums){
        int cnt =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] %2 ==0){
                cnt++;
            }
        }

        return cnt;
    }
}
