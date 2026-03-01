package hardQuest;
import java.util.Scanner;

public class HardQ06 {
    /*
    sum = 1 - 2/2! + 3/3! - 4/4! + 5/5! ...
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇번째 항까지 구할지 입력하세요:");
        int n = Integer.parseInt(sc.nextLine());
        long nPact = 1L; // nPact = n!
        long sign = -1; // sign(1>1 2>-1)
        double aN; // aN = n * sign / nPact
        double sN=0; // sN = a1 + a2+ a3+ a4+ ...

        for(int i=1; i<=n; i++){
            nPact *=i;
            sign *= (-1);
            aN =  (double)(i) * sign / nPact;
            sN +=aN;

        }
        System.out.println(n +"까지의 합은 : " + sN);
        sc.close();










    }
}
