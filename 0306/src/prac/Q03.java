package prac;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0, p_cnt = 0, m_cnt=0,
                Odd_cnt=0, Even_cnt=0;

        while(c <5){
            c++;
            int num = sc.nextInt();
            if( num >0){
                p_cnt++;
                if(num %2 ==0){
                    Even_cnt++;
                }
                else{
                    Odd_cnt++;
                }
            } else{
                m_cnt++;
            }
        }
        System.out.printf("양수 개수 : %d, 음수 개수 : %d\n" +
                "짝수 개수 : %d, 홀수 개수 : %d",
                p_cnt,m_cnt,Even_cnt,Odd_cnt);

    }

}
