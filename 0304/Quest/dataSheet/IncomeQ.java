package dataSheet;
import java.util.*;

public class IncomeQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("사원번호, 일한시간(주급), 시간당 임금을 입력하세요 : ");
        int empNo = Integer.parseInt(sc.nextLine());
        int weekHo = Integer.parseInt(sc.nextLine());
        int payPerHo = Integer.parseInt(sc.nextLine());
        double totalPay =0.0;

        if(weekHo > 40){
            int over;
            over = weekHo - 40;
            totalPay = (over * payPerHo * 1.5) +(weekHo - over) * payPerHo;

        }
        else {
            totalPay = weekHo * payPerHo;
        }
        if(totalPay > 400000.0){
            totalPay -= 30000.0;
        }

        System.out.println(empNo +"의 총임금");
        System.out.println(totalPay +"원");




    }
}
