package Quest.method;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        String[] recommendMenu = {"맑은곰탕", "뽀얀곰탕", "한돈 곱창전골", "숙성 연어회", "명란들깨크림수제비",
                "어유린기", "한우육회사시미반 연어반", "한우육회반 연어반", "백탕면", "미나리 삼겹살 정식"};

        System.out.println("= 메뉴추천= ");
        System.out.println(Arrays.toString(recommendMenu));
        System.out.printf("여기서 고를 메뉴는 : %s", recommendMenu[randomIndex(recommendMenu)]);


    }
    public static int randomIndex(String[] arr){
        int arrLength = arr.length;
//        (int)(Math.random() * (최대값 - 최소값 + 1)) + 최소값
//         * ((arrLength-1) - 0 + 1) + 0
        return (int) (Math.random() * arrLength);
    }
}
