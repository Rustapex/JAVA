package hardQuest;

import java.util.Scanner;

public class HardQ04 {
    /*
    * 이름과 국어, 영어, 수학 3과목 점수가 입력된다. (학생수 입력 : )
개인평균을 구하고 90점 이상이면 "EXCELLENT", 60점 미만이면 "FAIL"을
입력자료 및 개인 평균과 함께 출력하고 마지막으로 각 과목별 평균점수를 프린트 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력할 학생 수 : ");
        int stuCnt = Integer.parseInt(sc.nextLine());

        System.out.println("이름, 국어, 영어 수학 점수를 입력하세요. ENTER로 구분");
        String[] stuName = new String[stuCnt];
        int[] korScore = new int[stuCnt];
        int[] engScore = new int[stuCnt];
        int[] mathScore = new int[stuCnt];
        int sumKor = 0, sumEng = 0, sumMath = 0;

        for (int i = 0; i < stuCnt; i++) {
            stuName[i] = sc.nextLine();
            korScore[i] = Integer.parseInt(sc.nextLine());
            engScore[i] = Integer.parseInt(sc.nextLine());
            mathScore[i] = Integer.parseInt(sc.nextLine());


            int avgScore = (korScore[i] + engScore[i] + mathScore[i]) / 3;
            if (avgScore >= 90) {
                System.out.println(stuName[i] + " : EXCELLENT");
                System.out.println("개인 평균은 : " + avgScore);

            } else if (avgScore >= 60) {
                System.out.println("개인 평균은 : " + avgScore);
            } else {
                System.out.println(stuName[i] + " : FAIL");
                System.out.println("개인 평균은 : " + avgScore);

            }
            System.out.println("국어 : " + korScore[i]);
            System.out.println("영어 : " + engScore[i]);
            System.out.println("수학 : " + mathScore[i]);


        }
        for (int i = 0; i < korScore.length; i++) {
            sumKor += korScore[i];
            sumEng += engScore[i];
            sumMath += mathScore[i];
        }
        double avgKor = (double) sumKor / korScore.length;
        double avgEng = (double) sumEng / engScore.length;
        double avgMath = (double) sumMath / mathScore.length;
        System.out.printf("국어 평균 : %.1f%n" ,avgKor);
        System.out.printf("영어 평균 : %.1f%n " , avgEng);
        System.out.printf("수학 평균 : %.1f%n " , avgMath);

        sc.close();


    }
}
