package Class1;
import java.util.*;

public class Q2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int res=0;

        StringTokenizer st = new StringTokenizer(sc.nextLine());

        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            arr[i] = arr[i] * arr[i];
            res += arr[i];
        }
        res = res % 10;

        System.out.println(res);
    }
}