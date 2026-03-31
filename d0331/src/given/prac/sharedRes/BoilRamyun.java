package given.prac.sharedRes;

public class BoilRamyun implements Runnable {
    Ramyun ramyun;

    public BoilRamyun(Ramyun ramyun) {
        this.ramyun = ramyun;
    }

    @Override
    public void run() { //synchronized 가능
        while (true) {
            synchronized (ramyun) {
                if (ramyun.getCount() <= 0) {
                    System.out.println(Thread.currentThread().getName() + "라면 없음");
                    break;
                }

                System.out.println(Thread.currentThread().getName() + "라면 끓이는 중");
                ramyun.setCount(ramyun.getCount() - 1);
                System.out.println("남은 라면 : " + ramyun.getCount());
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
