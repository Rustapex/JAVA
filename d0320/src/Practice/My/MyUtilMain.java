package Practice.My;

import java.util.Scanner;

public class MyUtilMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyUtil myUtil = new MyUtil();

        // 별 n개 출력
        System.out.print("별을 출력할 개수 : ");
        int starCnt = Integer.parseInt(sc.nextLine());
        myUtil.printStar(starCnt);

        // 2. 기존 구현 클래스 사용
        HelloRun helloRun = new HelloRun();

        System.out.print("HelloRun 클래스를 반복할 횟수를 입력하세요: ");
        int loopCnt1 = Integer.parseInt(sc.nextLine());
        myUtil.executeNTimes(helloRun, loopCnt1);

        // 3. 익명 클래스 사용
        System.out.print("익명 클래스를 반복할 횟수를 입력하세요: ");
        int loopCnt2 = Integer.parseInt(sc.nextLine());

        myUtil.executeNTimes(new MyCodeRun() {
            @Override
            public void codeRun() {
                System.out.println("익명 클래스로 실행한 코드입니다.");
            }
        }, loopCnt2);

        // 4. 별이 점점 늘어나는 모양 출력
        System.out.print("별을 출력할 횟수를 입력하세요: ");
        int starCount = Integer.parseInt(sc.nextLine());
        myUtil.printDescendingStars(starCount);

        sc.close();


    }
}
