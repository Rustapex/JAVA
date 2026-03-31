package given.prac.Async;

// class A {void run(){}
// abstract class A{abstract void run();}

public class Ex02 {
    public static void main(String[] args) throws InterruptedException {
        // interface 구현 방법
        /* [1. 이름 있는 클래스] => extends Thread
           2. 익명 클래스
           3. functional interface => 람다식
         */

        //thread extends
        class DanceA extends Thread {
           @Override public void run(){
               for(int i=1; i<= 10; i++){
                   System.out.println("a가 춤을 춘다.");
               }
           }
        }

        //thread extends
        class DanceB extends Thread {
            @Override public void run(){
                for(int i=1; i<= 10; i++){
                    System.out.println("b가 춤을 춘다.");
                }
            }
        }


        DanceA d1 = new DanceA();
        DanceB d2 = new DanceB();

        d1.start();
        d2.start();

        d1.join();
        d2.join();





    }
}
