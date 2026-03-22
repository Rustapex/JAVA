package Test1.Q3;

public class Q3 {
    public static void main(String[] args) {
        int[] studentScore = new int[]{100, 90, 80, 70, 95};
        int sum=0;
        int max = studentScore[0];

        for (int j : studentScore) {
            sum += j;
            if(max <= j){
                max = j;
            }
        }
        double avg = (double) sum / studentScore.length;

        System.out.println("전체 합계 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("최고 점수 : "+ max);



    }
}
