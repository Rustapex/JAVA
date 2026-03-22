package Test2.Q1;

public class Q1 {
    public static void main(String[] args) {
        int[] temperatures = {33, 35, 32, 35, 36, 35, 34};
        int sum=0;
        double avgTemp;
        int avgHighCnt = 0;
        int degree35Cnt = 0;
        int highTemp = temperatures[0];

        //모든 기온 한 줄에 하나씩
        for (int temperature : temperatures) {
            System.out.println(temperature);
            sum += temperature;
            if(temperature >35){
                degree35Cnt++;
            }
            if(highTemp < temperature){
                highTemp = temperature;
            }
        }

        avgTemp = (double)sum / temperatures.length;
        System.out.printf("평균 기온 : %.1f%n", avgTemp);
        System.out.printf("35도를 초과한 날의 수 : %d%n",degree35Cnt);
        System.out.printf("최고 기온 :  %d%n", highTemp);

        for (int temperature : temperatures) {
            if(avgTemp < temperature){
                avgHighCnt++;
            }
        }
        System.out.println("평균보다 높은 기온의 개수 : " + avgHighCnt);
    }
}
