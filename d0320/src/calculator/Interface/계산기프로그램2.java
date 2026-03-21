package calculator.Interface;

import java.util.Scanner;

public class 계산기프로그램2 {
    // 멤버로 가짐
    // 의존성(Dependency)
    Calculator cal;


    // 외부에서 생성된 계산기 객체 받아오기

    // 생성자를 통해서(생성자 주입)
    // setter를 통해서 (setter 주입)

    public void setCal(Calculator cal) {
        this.cal = cal;
    }
    public void run(){
        //두 수를 입력 하고 계산해 주기 실행
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수 입력(공백으로 구분)");
        int su1 = sc.nextInt();
        int su2 = sc.nextInt();

        int result = cal.add(su1, su2);
        System.out.printf("%d + %d = %d%n", su1, su2, result);
    }
    public static void main(String[] args) {
        계산기프로그램2 p = new 계산기프로그램2();
//        p.setCal(new SYSCalculator());
//        p.setCal(new SMCalculator());
//        p.setCal(new LGCalculator()); 의미 있는 서로 다른 회사의 클래스 작성하는 것(setter로 주입)

        //익명 클래스 작성하는 것(interface에서 가져와서 override함)
        p.setCal(new Calculator() {
            @Override
            public int add(int su1, int su2) {
                System.out.println("익명 구현 add");
                return su1+su2;
            }
            @Override
            public int sub(int su1, int su2) {
                System.out.println("익명 구현 sub");
                return su1-su2;
            }
        });
    }

}
