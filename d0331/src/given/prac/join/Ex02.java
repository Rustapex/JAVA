package given.prac.join;

public class Ex02 {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        a.start();
        b.start();

        a.join();
        b.join();

        int result1 = a.getSum();
        int result2 = b.getSum();
        System.out.println("종료 " + (result1+result2));


    }
}
