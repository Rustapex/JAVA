package given.prac.Async;

public class Ex05 {
    public static void main(String[] args) throws InterruptedException {

        // interface 구현 방법
        /* 1. 이름 있는 클래스
           2. 익명 클래스 =
           [3. functional interface] => 람다식 (내부적으로 익명 클래스와 같음)
         */

        Thread dancer1 = new Thread(() ->{
            for(int i = 0; i < 10; i++){
                System.out.println("dancer1이 춤을 춘다.");
            }
        });
        Thread dancer2 = new Thread(() ->{
            for(int i = 0; i < 10; i++){
                System.out.println("dancer2이 춤을 춘다.");
            }
        });
        dancer1.start();
        dancer2.start();

        dancer1.join();
        dancer2.join();

        System.out.println("main 종료");

    }
}
