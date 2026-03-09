package array;

public class Array2 {
    public static void main(String[] args) {

        // 1차원 배열 : 기억 장소의 집합(1차원)
        /* 배열
        배열은 자료형의 기본값으로 초기화해줌(초기화 안했을 경우)
        * */

        int[] kors = new int[5]; /*int형 기억장소(변수)를 연속적으로 5개 확보*/
        kors = new int[]{1, 5, 4, 3, 2};

        int[] engs = new int[]{1, 2, 4, 5, 6}; // 초기화한 값들의 개수만큼 배열을 만들고 값 넣음

        int[] maths = {1, 2, 3, 4, 5, 6, 7}; //초기화 값 만큼만 배열을 만들고 값을 넣어줌.

        for(int i=0; i<maths.length; i++){
            System.out.print(maths[i]);
            if(i<(maths.length-1)){
                System.out.print(", ");
            }
        }
        System.out.println();

    }
}
