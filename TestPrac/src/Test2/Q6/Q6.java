package Test2.Q6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String memId = sc.nextLine();
        int workH = Integer.parseInt(sc.nextLine());
        int hPerMoney = Integer.parseInt(sc.nextLine());

        double workMoney = paySum(workH, hPerMoney);
        double[] result = resTax(workMoney);
        double netSalary = calNetSalary(result[0], result[1]);

        System.out.printf("사번: %s%n근무시간 : %d%n시간당 임금 : %d%n",memId,workH,hPerMoney);
        System.out.printf("총지급액 : %.2f%n세금 : %.2f%n실수령액 : %.2f%n",workMoney,result[1],netSalary);

    }

    // 보완 사항 : 그냥 입력도 배열로 받고 메서드의 매개변수도 배열로 받았으면 좀더 편리했을 텐데 복잡해짐.

    public static double paySum(int workH, int hPerMoney){
        double totalSum = 0.0;
        if(workH >40){
            int overH = workH - 40;
            totalSum = totalSum+ (overH * 1.5 * hPerMoney);
            totalSum = totalSum + ((workH-overH) * hPerMoney);
        } else{
            totalSum += (workH * hPerMoney);
        }
        return totalSum;
    }

    public  static double[] resTax(double workMoney){
        double tax =0.0;
        double resWorkMoney = workMoney;
        if(workMoney > 400000.0){
            tax = 30000.0;
            workMoney -= tax;
        }
        return new double[]{resWorkMoney,tax};
    }
    public static double calNetSalary(double totalSum , double tax){
        return totalSum - tax;
    }
}
