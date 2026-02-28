package hardQuest;

import java.util.Scanner;

public class HardQ02 {
    /*2. 입력자료로 사원의 이름과 구분코드와 작업시간이 들어온다.
이때 구분코드가          1이면    시간당 2000원
                         2이면   시간당  2500원
                         3이면   시간당  3000원
                         4이면   시간당  4000원으로 계산하여 임금을 출력*/
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 구분코드 작업시간 순으로 입력하세요 : ");
        String staffName = sc.nextLine();
        int payCode = sc.nextInt();
        int payPerHour = sc.nextInt();

        int calSalary;

        switch (payCode) {


            case 1:
                calSalary = payPerHour * 2000;
                break;
            case 2:
                calSalary = payPerHour * 2500;
                break;
            case 3:
                calSalary = payPerHour * 3000;
                break;
            case 4:
                calSalary = payPerHour * 4000;
                break;
            default:
                calSalary = 0;
        }
        System.out.println(staffName + "의 임금");
        System.out.println("구분코드 : " + payCode);
        System.out.println("총 임금 : " + calSalary);


        sc.close();

    }
}
