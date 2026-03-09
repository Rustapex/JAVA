package easyQuest;

public class Q2 {
    public static void main(String[] args) {
        int[] Temperatures = {33, 35, 32, 35, 36, 35, 34};
        int sum=0;
        double avg;
        int cnt35d=0;
        int highT=0;

        /*이번주 날씨 정보*/
        System.out.println("이번 주 날씨 정보");
        for (int i=0 ; i< Temperatures.length; i++) {
            System.out.printf("%d ", Temperatures[i]);
            sum += Temperatures[i];
                if(Temperatures[i] >35){
                cnt35d++;
            }
            if(highT <= Temperatures[i]){
                highT = Temperatures[i];
            }
        }
        System.out.println();
        /*평균 온도*/
        System.out.println("평균온도");
        avg = (double) sum / Temperatures.length;
        System.out.printf("%.3f%n", avg);

        /*35도가 넘는 날의 횟수*/
        System.out.println("35도가 넘는 날의 횟수 : " +  cnt35d);

        /*가장 높은 온도를 구하시오*/


    }
}
