package prac;

public class Q01Odd {
    public static void main(String[] args) {
        int sum=0;
        int N=1;

        while(N<= 99){
            sum += N;
            N = N+2;

        }
        System.out.println(sum);
    }

}
