package given.prac.Async.Quest;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {

        int[] arrA = {90, 80, 100, 95, 80};
        int[] arrB = {70, 100, 100, 80, 80};
        int[] arrC = {88, 40, 100, 100, 60};

        int[] sums = new int[3];

        Thread threadA = new Thread(()-> {
            int sum =0;
            for(int i=0; i< arrA.length; i++){
                sum += arrA[i];
                System.out.println("A반 계산중..");
            }
            sums[0] = sum;
            System.out.println("a반 계산 완료");
            System.out.printf("a반 총점  : %d%n", sum);
        });
        Thread threadB = new Thread(()-> {
            int sum =0;
            for(int i=0; i< arrB.length; i++){
                sum += arrB[i];
                System.out.println("B반 계산중..");
            }
            sums[1] = sum;
            System.out.println("B반 계산 완료");
            System.out.printf("B반 총점  : %d%n", sum);
        });
        Thread threadC = new Thread(()-> {
            int sum =0;
            for(int i=0; i< arrC.length; i++){
                sum += arrA[i];
                System.out.println("C반 계산중..");
            }
            sums[2] = sum;
            System.out.println("C반 계산 완료");
            System.out.printf("C반 총점  : %d%n", sum);
        });

        threadA.start();
        threadC.start();
        threadB.start();

        threadA.join();
        threadB.join();
        threadC.join();

        System.out.println("모든 반 계산완료");
        System.out.printf("A반 : %d%nB반 : %d%nC반 : %d%n",sums[0], sums[1], sums[2]);

    }
}
