package given.prac.demon;

public class Ex01 {
    public static void main(String[] args) {
        Thread th = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
                System.out.println(i);
            }
        });

        th.setDaemon(true);
        th.start();

        try {
            Thread.sleep(5000);
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("프로그램 종료");
    }
}
