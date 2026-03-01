package hardQuest;
import java.util.Scanner;


public class HardQ05 {
    /* 5. 다음 등비수열에 대하여 7번째 항까지의 합을 구하는 순서도를 작성하시오
      2,  6,  18,  54, 162,  486*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("등비수열의 몇번째 항까지 합을 구할지 입력하세요:");
        int nthTerm = Integer.parseInt(sc.nextLine());
        int firstTerm = 2;
        int commonRatio = 3;
        long result;

        if(nthTerm<=0){
            System.out.println("0보다 큰 값을 입력하세요");
            return;

        }
        else if(nthTerm ==1){
            result = firstTerm;
        }
        else{
            long rn = 1L;
            for(int i=0; i<nthTerm; i++){
                rn *= commonRatio;
            }
            result = firstTerm * (rn -1) / (commonRatio-1);

        }

        System.out.println("등비수열의 " + nthTerm +"번째 항까지의 합 : " + result );
        sc.close();


    }
}
