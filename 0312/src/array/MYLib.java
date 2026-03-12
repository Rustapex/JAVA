package array;

import java.util.Scanner;
import java.util.StringTokenizer;

// method 를 제공할 목적
// main이 없는 method
public class MYLib {

    public static void  printStar( int cnt) {
        for( int i=1; i<=cnt; i++) {
            System.out.print("*");
        }

    }
    public static void printMinus() {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        // 공백(개행, space, tab, \n) 기준으로 구분
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a-b);

        sc.close();
    }

}
