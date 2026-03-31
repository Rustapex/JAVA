package thread;

public class RaceConditionDemo {
    static class Counter{
        int count =0;
        public void increase(){
            count++;} // 공유 자원 문제 가능
    }
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task= () -> {
            for(int i=0; i<100000; i++){
                counter.increase();
            }
        };

        Thread t1=new Thread(task);
        Thread t2=new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("최종 count = " + counter.count);

    }
}
