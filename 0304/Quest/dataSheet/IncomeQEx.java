package dataSheet;
import java.util.*;


public class IncomeQEx {
    public static void main(String[] args) {

        int netpay;
        int no, hour, wages;

        double gorsspay;
        int worktime,overtime;
        final int BASETIME = 40;
        final double OVERATE = 1.5;
        final int TAX = 30000;

        Scanner sc = new Scanner(System.in);
        System.out.println("사원번호, 일한시간, 임금 입력 : ");
        no = sc.nextInt();
        hour = sc.nextInt();
        wages = sc.nextInt();

        if(hour > BASETIME){
            worktime = BASETIME;
            overtime = hour - BASETIME;
        } else{
            worktime = hour;
            overtime =0;
        }
        gorsspay = worktime * wages + overtime *(wages * OVERATE);

        if(gorsspay > 400000){
            netpay = (int)gorsspay - TAX;
        } else{
            netpay = (int)gorsspay;
        }

        System.out.println( no +" 의 실 수령액 : " + netpay);


    }
}
