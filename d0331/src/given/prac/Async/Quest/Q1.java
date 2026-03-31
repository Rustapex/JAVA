package given.prac.Async.Quest;

public class Q1 {
    public static void main(String[] args) throws InterruptedException {

        class chefA extends Thread{
            @Override
            public void run(){
                for(int i=0; i<10; i++){
                    System.out.println("a가 라면을 끓인다.");
                }
            }
        }
        class chefB implements Runnable{
            @Override
            public void run(){
                for(int i=0; i<10; i++){
                    System.out.println("B가 김밥을 만든다.");
                }
            }
        }

        chefA chefA = new chefA();
        Thread chefB = new Thread(new chefB());

        chefA.start();
        chefB.start();

        chefA.join();
        chefB.join();

        System.out.println("주문 완료");
    }
}
