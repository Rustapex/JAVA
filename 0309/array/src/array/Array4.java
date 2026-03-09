package array;

public class Array4 {
    public static void main(String[] args) {

        /*boolean의 default : false*/
        boolean[] TOrF = {true, true, false, false, false};

        for(int i=0; i<TOrF.length; i++){
            System.out.println(TOrF[i]);
        }

        double[] douArr = {1.1, 2.2, 3.0, 4.0, 5.5};

        System.out.println(douArr[0]);
        System.out.println(douArr[1]);
        System.out.println(douArr[2]);
        System.out.println(douArr[3]);
        System.out.println(douArr[4]);

        for(int i=0; i<douArr.length; i++){
            System.out.printf("%.1f ", douArr[i]);
        }

        int[] intArr = new int[]{1, 2, 3, 4, 5};
        for (int i : intArr) {
            System.out.printf("%d ", intArr[i]);
        }
        System.out.println();
        for(int i=0; i< intArr.length; i++){
            System.out.println(intArr[i]);
        }


    }
}
