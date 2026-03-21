package calculator.notInterface;

import java.util.Scanner;

public class 계산기프로그램0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //기반 스트림 보조 스트림?

        System.out.print("두 수 입력 :");
        int su1 = sc.nextInt();
        int su2 = sc.nextInt();

        LGCalculator lgCal = new LGCalculator();
        int lgResult = lgCal.addLG(su1, su2);
        System.out.println(lgResult);

        SMCalculator smCal = new SMCalculator();
        int smResult = smCal.addSM(su1, su2);
        int smResult2 = smCal.subSM(su1, su2);
        System.out.printf("%d + %d = %d%n%d - %d = %d%n", su1, su2, smResult, su1, su2, smResult2);

    }
}
