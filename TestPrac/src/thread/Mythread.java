package thread;

public class Mythread extends  Thread{
    @Override
    public void run(){
        System.out.println("새로운 스레드에서 실행됨");
    }
}
