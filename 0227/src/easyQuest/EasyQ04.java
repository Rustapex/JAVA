package easyQuest;

public class EasyQ04 {
    /*1+3+5 .... 의 등차수열에서 얼마까지 합하면 그 값이 1000을 처음으로 초과하는가를 알아보
는 순서도를 작성하시오 (그 때의 마지막 항과 초과한 값을 출력할 것) */
    public static void main(String[] args) {
        int term=1;
        int sum=0;
        final int MAX = 25;

        while(sum<= MAX){
            sum += term;
            term +=2;
        }
        term -= 2;
        System.out.println("마지막 값 구하기 : " + term);
        System.out.println( MAX +"을 초과한 값 : " + sum);

    }
}
