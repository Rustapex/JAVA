package given.prac.sharedRes;

public class Ex01 {
    static int su=0; // 2개의 스레드가 su라는 변수의 값을 증가시키기

    static synchronized void increase(){ //synchronized 안 붙이면 동기화가 안돼 200이 안나옴
        for(int i=1; i<101; i++){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            su = su+1;
            /*synchronized (Ex01.class) {  여기에다가 synchronized가 더 효율적임
                su++;
            }*/
        }
    }


    public static void main(String[] args) {
        Thread a = new Thread(new Runnable() { // 익명 클래스, 익명 객체
            @Override
            public void run() {
                increase();
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                increase();
            }
        });

        a.start();
        b.start();

        try{
            a.join();
            b.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
        System.out.println(su);
    }
}
