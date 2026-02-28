package hardQuest;

import java.util.Scanner;

public class HardQ03 {
    /*다음과 같은 수열을 FIBONACCI수열이라고 합니다
   1,1,2,3,5,8,13,21 ....
   즉, 앞의 두 항을 합하면 다음 항이 됩니다.
  50개의 FIBONACCI수열을 구하여 인쇄*/
    public static void main(String[] args) {
        int prev = 1, curr = 1, next;

        Scanner sc = new Scanner(System.in);
        System.out.println("피보나치 수열을 구할 항의 개수 : ");
        int count = sc.nextInt();
        if (count == 1) {
            System.out.println(prev);
        } else if (count == 2) {
            System.out.println(prev);
            System.out.println(curr);
        } else if (count >2){
            System.out.println(prev);
            System.out.println(curr);

            for (int i = 0; i < (count - 2); i++) {

                next = prev + curr;
                System.out.println(next);
                prev = curr;
                curr = next;
            }

        } else{

            System.out.println("잘못된 입력값 입니다.");
            System.out.println("0보다 큰 정수를 입력하세요");
        }

        sc.close();


    }
}
