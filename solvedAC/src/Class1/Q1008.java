package Class1;

import java.util.*;

public class Q1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        // 공백(개행, space, tab, \n) 기준으로 구분
        int a = Integer.parseInt(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double result = a / b;
        System.out.println(result);

//        int로 입력받고, double로 형변환
//        double result  = (double) a /b

        sc.close();
    }
}
