package given.prac.demon;

public class Ex02 {
    public static void main(String[] args) throws InterruptedException {
        class StudentA extends Thread{
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    System.out.println("a 학생 시험 작성중...");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }
        }

        StudentA s1 = new StudentA();
        Thread s2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    System.out.println("b 학생 시험 작성중...");
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }
        });

        Thread autoSave = new Thread(()-> {
            while(true){
                System.out.println("자동 저장 중...");
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        });
        autoSave.setDaemon(true);

        s1.start();
        s2.start();
        autoSave.start();

        s1.join();
        s2.join();


        System.out.println("프로그램 종료");
    }

}
