package Practice;

class MyUtil0 {

    // 1. 별을 3개 출력하기
    public void printThreeStars() {
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // 2. 원하는 문자를 3개 출력하기
    public void printThreeString(String c) {
        for (int i = 0; i < 3; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    // 3. 원하는 코드를 3번 실행하기, 라이브러리를 만들 때 결정할 수 없는 코드는 모두 인터페이스로 만들어서 제공한다.
    //                              라이브러리를 사용하는 사람(개발자)가 구현해서 책임져야 한다.
    // 원하는 코드 => 메서드 => 미오안성 메서드 => 추상 클래스 / 인터페이스
    public void runThreeTimes(Runnable action) {
        for (int i = 0; i < 3; i++) {
            action.run();
        }
    }
}