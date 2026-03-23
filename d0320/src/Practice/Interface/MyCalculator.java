package Practice.Interface;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 수를 입력하시오");

        int su1 = sc.nextInt();
        int su2 = sc.nextInt();

//        Calculator cal1 = new LGCalculator();  업캐스팅
        Calculator cal2 = new SYSCalculator();
        int result = cal2.add(su1,su2);
        System.out.println(result);

        Calculator cal3 = new DWCalculator();
        int result3 = cal3.add(su1, su2);

        int result2 = cal2.sub(su1,su2 );
        System.out.println(result2);


    }
}
