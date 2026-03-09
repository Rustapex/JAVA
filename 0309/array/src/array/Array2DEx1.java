package array;

public class Array2DEx1 {
    public static void main(String[] args) {
        int[] lottoNum = {10, 15, 19, 27, 30, 33};

        for (int i : lottoNum) {
            System.out.print(i);
            System.out.print(" ");

        }

        int[][] lotto2Month = {
                {10,15,19,27,30,33,14},
                {5,11,25,27,36,38,2},
                {5,8,25,31,41,44,45}
        };
        for(int i=0; i<lotto2Month.length; i++){
            for(int j=0; j<lotto2Month[i].length; j++) {
                System.out.printf("%d ",lotto2Month[i][j]);
            }
            System.out.println();
        }
    }
}
