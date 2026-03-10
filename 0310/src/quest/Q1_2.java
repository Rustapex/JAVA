package quest;
        /*1.화폐매수 구하기  문제
        : 사원명과  출장비가 입력될 때  출장비에 대한 화폐매수 (고액권부터)를 구하시오
        화폐단위는 다음과 같다  50000,10000,5000,1000,500,100, 50,10 */

import java.util.Scanner;

public class Q1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);





        int[][] moneyUnits = {
                {50000, 0},
                {10000, 0},
                {5000, 0},
                {1000, 0},
                {500, 0},
                {100, 0},
                {50, 0},
                {10, 0},
        };
        while(true){
            System.out.print("사원명 입력: ");
            String employeeName = sc.nextLine();


            if(employeeName.equals("stop")){
                break;
            }
            System.out.print("출장비 입력:");
            int travelExpense = Integer.parseInt(sc.nextLine());

            int restAmount = travelExpense;
            for (int i = 0; i < moneyUnits.length; i++) {
                if (restAmount >= moneyUnits[i][0]) {
                    int unitCount = restAmount / moneyUnits[i][0];
                    moneyUnits[i][1] = unitCount;
                    restAmount %= moneyUnits[i][0];


                }
            }
            System.out.printf("%s의 출장비: %d%n", employeeName, travelExpense);
            for (int i = 0; i < moneyUnits.length; i++) {
                System.out.printf("%d 수 : %d%n", moneyUnits[i][0], moneyUnits[i][1]);
            }
        }




    }
}
