package given.prac.interrupt;

import java.lang.management.ThreadInfo;


/*스마일 2 스레드가 자고 있을 때 인터럽트가 들어온 것
이때는 인터럽트 설정 정보를 초기화시킴
* */

class Smile2 extends Thread {
    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println("^__^");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("잠자는 중 interrupt 발생");
                System.out.println("초기화 후 상태: " + isInterrupted());

                interrupt(); // 다시 interrupt 상태 설정
                System.out.println("다시 설정 후 상태: " + isInterrupted());
                return;
            }
        }
    }
}
