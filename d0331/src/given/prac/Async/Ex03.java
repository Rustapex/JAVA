package given.prac.Async;

public class Ex03 {
    public static void main(String[] args) throws InterruptedException {

        // interface 구현 방법
        /* [1. 이름 있는 클래스] => implements Runnable
           2. 익명 클래스
           3. functional interface => 람다식
         */

        class Dancer1 implements Runnable{
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("dancer1이 춤을 춘다.");
                }
            }
        }
        class Dancer2 implements Runnable{
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("dancer2가 춤을 춘다.");
                }
            }
        }

        Thread dance1 = new Thread(new Dancer1());
        Thread dance2 = new Thread(new Dancer2());

        dance1.start();
        dance2.start();

        System.out.println("main 종료");

        dance2.join();
        dance1.join();
    }
}
