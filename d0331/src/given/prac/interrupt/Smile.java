package given.prac.interrupt;

public class Smile extends Thread {
    @Override
    public void run() {
        /*while(true){
            System.out.println("haha");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                return;
            }
        }*/
        while (!isInterrupted()) { // interrupt 가 안걸리면 false, 걸리면 true
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
            System.out.println("heeeeeeee");
        }
        System.out.println("NO HEEE");
    }

}
