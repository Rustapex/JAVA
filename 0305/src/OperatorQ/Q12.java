package OperatorQ;

import java.util.*;
/*
     주문수량, 메뉴를 입력받아
     해당 주문의 주문금액을 출력하는 프로그램 작성하시오
     ( 메뉴, 가격 임의로 정하기 )
*/

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴");
        System.out.println("caffe(1) / cornetto(2) / gelato(3) / te(4) / exit(5)");
        int[][] menuPrice = {
                {1, 2000},
                {2, 4500},
                {3, 5000},
                {4, 3000}
        };
        String[] menu = {"caffe", "cornetto", "gelato", "te"};
        int totalPrice = 0;
        String totalMenu = "";
        boolean running = true;

        for (; running; ) {
            System.out.print("메뉴 : ");
            int menuName = Integer.parseInt(sc.nextLine());
            System.out.print("주문 수량 : ");
            int orderQty = Integer.parseInt(sc.nextLine());

            switch (menuName) {
                case 1 -> {
                    totalPrice += (menuPrice[0][1] * orderQty);
                    totalMenu += menu[0] + " ";
                }

                case 2 -> {
                    totalPrice += (menuPrice[1][1] * orderQty);
                    totalMenu += menu[1] + " ";
                }

                case 3 -> {
                    totalPrice += (menuPrice[2][1] * orderQty);
                    totalMenu += menu[2] + " ";
                }

                case 4 -> {
                    totalPrice += (menuPrice[3][1] * orderQty);
                    totalMenu += menu[3] + " ";
                }

                case 5 -> running = false;
                default -> System.out.println("다시 입력하세요");
            }


        }
        System.out.printf("%s : %d", totalMenu, totalPrice);

    sc.close();
    }
}
