package Quest.method;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("사원명 입력: ");
        String employeeName = sc.nextLine();

        System.out.print("출장비 입력:");
        int travelExpense = Integer.parseInt(sc.nextLine());

        int[] moneyUnits = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int[] unitCounts = getMoneyCounts(travelExpense, moneyUnits);

        System.out.printf("사원 명 : %s%n", employeeName);
        for(int i=0; i< moneyUnits.length; i++){
            System.out.printf("%d원 : %d장%n", moneyUnits[i], unitCounts[i]);
        }
    }
    public static int[] getMoneyCounts(int travelExpense, int[] moneyUnits) {
        int[] unitCounts = new int[moneyUnits.length];
        int restAmount = travelExpense;
        for (int i = 0; i < moneyUnits.length; i++) {
            if (restAmount >= moneyUnits[i]) {
                unitCounts[i] = restAmount / moneyUnits[i];
                restAmount %= moneyUnits[i];
            }
        }
        return unitCounts;
    }
}
