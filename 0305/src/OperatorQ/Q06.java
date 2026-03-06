package OperatorQ;

import java.util.*;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "";
        System.out.println("menu를 입력하세요 (1등록, 2조회, 3변경, 4삭제");
        System.out.println("1234를 제외한 입력 하면 종료");

        while (true) {
            String menu = sc.nextLine();
            switch (menu) {
                case "1" -> result = "등록";
                case "2" -> result = "조회";
                case "3" -> result = "변경";
                case "4" -> result = "삭제";
                default -> {
                    return;
                }

            }
            System.out.println(result);

        }

        /* while문 안 switch-case에서 while문 탈출 방법
        * loop : while(
        *   switch(menu){
        *       case 1 :
        *        ...
        *       default : break loop;
        *
        * */

    }
}
