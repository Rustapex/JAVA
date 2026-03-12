package Class1;

import java.math.BigDecimal;
import java.util.Arrays;

public class asdf {
    public static void main(String[] args) {
        int[] num = new int[5];
        for(int i=1; i<=num.length; i++){
            num[i-1] = i * 10;
        }
        System.out.print(Arrays.toString(num));
        System.out.println();
        double[] doubleArray = new double[3];
        for(int i=0; i<doubleArray.length; i++){
            doubleArray[i] = (double)(i+1) * 1.1;
        }

        for (double v : doubleArray) {
            System.out.println(v);
        }
        BigDecimal b = new BigDecimal("1.1");
        System.out.println(b.multiply(new BigDecimal("3")));
        int[] numbers = {5,10,15,20,25};
        int sum=0;
        for(int i=0; i< numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);

        int[][] array2D = {{2,4,6},{8, 10,12},{14,16,18}};
        int[] sumArray = new int[4];
        for(int i=0; i<array2D.length; i++){
            for(int j=0; j<array2D[i].length; j++){
                if(i==0){
                    sumArray[0] += array2D[i][j];
                } else if (i==1) {
                    sumArray[1] += array2D[i][j];
                } else {
                    sumArray[2] += array2D[i][j];
                }
                sumArray[3] += array2D[i][j];
            }
        }
        for(int i=0; i<sumArray.length-1; i++){
            System.out.printf("%d행의 합 : %d%n",i, sumArray[i]);
        }
        System.out.printf("전체 합 : %d",sumArray[3]);

    }
}
