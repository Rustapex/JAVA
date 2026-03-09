package array.ex;

import java.util.Scanner;

/*실습 )
1. 배열저장출력문제    (값 넣고  출력하기)
   1) 1차원배열 사용하기
*/
public class ArrayPrac1 {
    public static void main(String[] args) {

        /*학점 평점 계산 */
        Scanner sc = new Scanner(System.in);

        System.out.print("학번을 입력하세요 : ");
        int stuId = Integer.parseInt(sc.nextLine());

        System.out.print("강의 수를 입력하세요:");
        int lecCnt = Integer.parseInt(sc.nextLine());

        String[] letterGrade = new String[lecCnt];
        double sumGrade =0.0;
        double avgGrade;

        System.out.println("학점(A, B, C, D, F)을 입력하세요: ");
        for(int i=0; i<lecCnt; i++){
            letterGrade[i] = sc.nextLine();
        }
        for (String s : letterGrade) {
            switch (s){
                case "A" -> sumGrade += 4.5;
                case "B" -> sumGrade += 3.5;
                case "C" -> sumGrade += 2.5;
                case "D" -> sumGrade += 1.5;
                case "F" -> sumGrade += 0.0;
            }
        }
        avgGrade = sumGrade / lecCnt;

        System.out.printf("%d 학생의 평점은 : %.1f입니다.", stuId, avgGrade);

        sc.close();

    }
}
