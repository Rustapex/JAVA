package array;

public class Array2D {
    public static void main(String[] args) {
        /* 2차원 배열 : 1차원 배열의 집합, 1차원 배열을 여러 개 가지고 있는 배열
        접근 방법 :
        배열명[행 index][열 index]
        배열을 기준으로 몇번째 일차원 배열인지 찾는다(행 찾기)
        찾은 1차원 배열에서 몇번째 요소인지 찾는다.(열 찾기)


        * */

        String[][] teams = {
                {"I","II","III","IV" },
                {"A","B","C","D" },
                {"1","2","3","4" },
                {"first","second","third","fourth" },
                {"가","나","다","라" },
        };

        /*2차원 배열 출력하기*/

        /*첫 번째 팀(다운캐스팅)*/
        for(int i=0; i<teams[0].length; i++){
            System.out.printf("%s ", teams[0][i]);
        }
        System.out.println();

        /*다 출력하기*/
        for(int i=0; i< teams.length; i++){
            for(int j=0; j<teams[i].length; j++){
                System.out.printf("%s ", teams[i][j]);
            }
            System.out.println();
        }

        String[][] javaTeams =new String[2][3];
        javaTeams[0] = new String[]{"I", "II", "III"};
        javaTeams[1][0] = "A";
        javaTeams[1][1] = "B";
        javaTeams[1][2] = "C";

        for(int i=0; i<javaTeams.length; i++){
            for(int j=0; j<javaTeams[i].length; j++){
                System.out.printf("%s ", javaTeams[i][j]);
            }
            System.out.println();
        }

        for (String[] javaTeam : javaTeams) {
            for (String s : javaTeam) {
                System.out.printf("%s ", s);
            }
            System.out.println();
        }


    }
}
