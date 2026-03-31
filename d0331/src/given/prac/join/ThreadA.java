package given.prac.join;

public class ThreadA extends Thread{
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for(int i=1; i<=50; i++){
            sum += i;
            System.out.println(Thread.currentThread().getName()+ " " + i + " " + sum);
        }
    }
}
