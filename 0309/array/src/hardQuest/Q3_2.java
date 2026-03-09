package hardQuest;

public class Q3_2 {
    public static void main(String[] args) {
        int[] Temperatures = {33, 35, 32, 35, 36, 35, 34};
        int sum=0, avgPCnt=0;
        double avg;

        for (int temperature : Temperatures) {
            sum += temperature;
        }
        avg = (double) sum / Temperatures.length;
        for(int i=0; i<Temperatures.length; i++){
            if(avg < (double) Temperatures[i] ){
                avgPCnt++;
            }
        }
        System.out.printf("배열의 평균 값 %.2f 보다 더 큰 수의 개수는 : %d개 ",
                avg, avgPCnt);

    }
}
