package Test1.Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int inputNum = sc.nextInt();
        if(inputNum <1){
            System.out.println("출력: 잘못된 입력");
        } else{
            int sum=0;
            for(int i=3; i<=inputNum; i+=3){
                sum += i;
            }
            System.out.printf("출력: %d%n", sum);
        }
        sc.close();
    }
}
