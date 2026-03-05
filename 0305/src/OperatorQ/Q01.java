package OperatorQ;

import java.util.*;

public class Q01 {
    /* 고객정보(아이디, 이름, 나이 ,키 ) 출력하기*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("id :");
        String customerId = sc.nextLine();
        System.out.print("name :");
        String customerName = sc.nextLine();
        System.out.print("age :");
        int customerAge = Integer.parseInt(sc.nextLine());
        System.out.print("weight :");
        int customerWeight = Integer.parseInt(sc.nextLine());

        System.out.printf("%s : %s\n%s : %s\n%s : %d\n%s : %d"
                , "id", customerId, "name", customerName, "age", customerAge, "weight", customerWeight);
        sc.close();
    }
}
