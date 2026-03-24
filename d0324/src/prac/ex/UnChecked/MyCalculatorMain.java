package prac.ex.UnChecked;

import java.io.IOException;

public class MyCalculatorMain {
    public static void main(String[] args) {
        MyCalculator cal = new MyCalculator();
        int total=0;
        try {
            total = cal.add(3,-3);
        } catch (Exception e) {
            System.out.println("음수면 ~ 하겠다");
        }
        System.out.println(total);

//        int result = cal.add2(3, 5);
//        System.out.println(result);

        try{
            cal.add(5, -2);
        } catch (Exception e){
//            e.printStackTrace();
        }
        System.out.println("dfdffd");


    }
}
