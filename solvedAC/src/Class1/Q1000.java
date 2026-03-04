package Class1;
import java.util.*;

public class Q1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        // 공백(개행, space, tab, \n) 기준으로 구분
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a+b);

        sc.close();
    }
}
