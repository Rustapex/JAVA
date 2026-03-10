package hardQuest;

/*
* char 2차원배열(5*5)  배열을 만들고 배열의  테두리 요소에   '*' 넣기 */

public class Q4 {
    public static void main(String[] args) {
        char[][] stars  =new char[5][5];

        /* 0    1   2   3   4
        0  *    *   *   *   *
        1  *                *
        2  *                *
        3  *                *
        4  *    *   *   *   *
        * */

        for(int i=0; i<stars.length; i++){
            for(int j=0; j<stars[i].length; j++){
                if(i==0 || i==4 || j==0 || j==4){
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }
                if(j ==4){
                    System.out.println();
                }

            }
        }



    }
}
