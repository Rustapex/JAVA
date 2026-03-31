package given.prac.sharedRes;

public class Main {
    public static void main(String[] args) {
        Ramyun ramyun = new Ramyun(20);

        Thread t1 = new Thread(new BoilRamyun(ramyun), "Alice");
        Thread t2 = new Thread(new BoilRamyun(ramyun), "Matteo");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("끝");
    }
}
