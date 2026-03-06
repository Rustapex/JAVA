package prac;
/*
* 1 + 3 + 5 + 7 + ... + 99*/

public class Q01 {
    public static void main(String[] args) {
        int sum=0; //누적합 sum

        for(int n=1; n<=99; n+=2){
            sum = sum+n;
        }
        System.out.print("99까지 모두 더해진 합계 : " + sum);

    }
}
