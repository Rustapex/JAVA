package given.prac.interrupt;

public class Smile3 extends Thread{
    public void run(){
        for( int i=0 ; i<10 ; i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                return;
            }
        }
    }

}
