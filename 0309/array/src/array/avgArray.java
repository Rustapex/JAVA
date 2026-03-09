package array;

public class avgArray {
    public static void main(String[] args) {
        int[] kors = {100, 90, 80, 70, 60};
        int sum =0;
        double avg;

        for (int kor : kors) {
            sum += kor;
        }
        avg = (double) sum / kors.length;
        System.out.printf("평균은 : %.1f", avg);

    }
}
