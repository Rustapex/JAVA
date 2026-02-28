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
        int stuCnt = sc.nextInt();

        System.out.println("이름, 국어, 영어 수학 점수를 입력하세요. ENTER로 구분");
        String[] stuName = new String[stuCnt];
        int[] korScore = new int[stuCnt];
        int[] EngScore = new int[stuCnt];
        int[] mathScore = new int[stuCnt];

        for(int i=0; i< stuCnt; i++){
            String result;
            stuName[i] = sc.nextLine();
            korScore[i] = sc.nextInt();
            EngScore[i] = sc.nextInt();
            mathScore[i] = sc.nextInt();

            int avgScore = (korScore[i] + EngScore[i] + mathScore[i])/3;
            if (avgScore >= 90){

            }

            System.out.println(stuName[i] +"의 평균 점수 : " +avgScore);



        }






            }
}
