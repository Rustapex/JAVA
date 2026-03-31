package given.prac.sleep;

public class Ex02 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        counter.start();
        counter.join();

        System.out.println("main 종료");

    }
}
