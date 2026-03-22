package Test1.Q9;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator[] calculators = new Calculator[3];

        calculators[0] = new AddCalculator();
        calculators[1] = new SubCalculator();
        calculators[2] = new Calculator() {
            @Override
            public int calc(int a, int b) {
                return 0;
            }
        };
        System.out.print("두 수를 입력하세요:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0; i<calculators.length; i++){
            if(i ==0){
                System.out.printf("%d + %d = %d%n", a,b,calculators[i].calc(a, b));
            } else if( i==1){
                System.out.printf("%d - %d = %d%n", a,b,calculators[i].calc(a, b));
            } else{
                System.out.printf("익명클래스 연산 : %d%n", calculators[i].calc(a,b));
            }
        }
    }
}
