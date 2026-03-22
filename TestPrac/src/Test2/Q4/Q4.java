package Test2.Q4;
/* 0 1 2 3 4
0  * * * * *
1  * - - - *
2  * - - - *
3  * - - - *
4  * * * * *
* */

public class Q4 {
    public static void main(String[] args) {
        char[][] starArr = new char[5][5];

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==0 || i==4 ||j==0 || j==4){
                    starArr[i][j] = '*';
                } else{
                    starArr[i][j] = ' ';
                }
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(starArr[i][j]);
            }
            System.out.println();
        }

    }
}
