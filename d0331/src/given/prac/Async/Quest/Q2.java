package given.prac.Async.Quest;

public class Q2 {
    public static void main(String[] args) throws InterruptedException {

        class Worker1 extends Thread{
            @Override public void run(){
                for(int i=0; i<5; i++){
                    System.out.println("음료 코너 정리중");
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException e){
                        e.printStackTrace();
                        System.out.println("인터럽트 발생");
                        return;
                    }
                }
            }
        }
        class Worker2 implements Runnable{
            @Override public void run(){
                for(int i=0; i<5; i++){
                    System.out.println("과자 코너 정리중");
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException e){
                        System.out.println("인터럽트 발생");
                        return;
                    }
                }
            }
        }

        Thread t1 = new Thread(new Worker1());
        Thread t2 = new Thread(new Worker2());
        Thread t3 = new Thread(()->{
            for(int i=0; i<5; i++){
                System.out.println("냉동식품 코너 정리 중");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    throw  new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();


        System.out.println("매장 정리 종료");
    }
}
