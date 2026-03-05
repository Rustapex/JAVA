package OperatorQ;
import java.util.Scanner;

/*
  구구단 출력, 원하는단 출력
*/

public class Q11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 단 : ");
        int dan = Integer.parseInt(sc.nextLine());

        for(int i=1; i<= 9; i++){
            System.out.printf("%d * %d = %d\n", dan, i, dan*i);
        }




    sc.close();
    }
}
