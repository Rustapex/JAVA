package thread;

public class MyTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable 작업 실행");
    }

    /*public synchronized  void increase(){
        count++;
    }*/

    public static void main(String[] args) {
        Thread t = new Thread(new MyTask());
        t.start();
        Mythread t2 = new Mythread();
        t2.start();

    }
}
