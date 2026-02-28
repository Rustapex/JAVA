package easyQuest;

public class EasyQ01 {
//    1+3+5+7+9+.....+99의 홀수의 합을 구하는 순서도
    public static void main(String[] args) {
        int sum = 0;

        for(int i =1; i<100; i +=2){
            sum +=i;
        }
        System.out.println("1부터 99까지 홀수의 합은 "+sum);

    }
}
