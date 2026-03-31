package thread;

public class BasicThreadDemo {
    static class Worker implements Runnable{
        private final String name;

        public Worker(String name){
            this.name = name;
        }
        @Override
        public void run(){
            for(int i=1; i<=5; i++){
                System.out.println(name + " 작업 중..." + i);
                try{
                    Thread.sleep(500); // 0.5s 쉬기
                } catch (InterruptedException e) {
                    System.out.println(name + " 인터럽트 발생");
                    return;
                }
            }
            System.out.println(name + " 작업 종료 ");
        }

    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Worker("스레드A"));
        Thread t2 = new Thread(new Worker("스레드B"));

        t1.start();
        t2.start();

        System.out.println("main : 두 스레드 시작 완료");

        t1.join();
        t2.join();

        System.out.println("main: 모든 작업 종료 확인");
    }
}
