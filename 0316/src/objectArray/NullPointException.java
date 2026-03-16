package objectArray;

public class NullPointException {
    public static void main(String[] args) {
//        int[] a = new int[3];

        Score[] scoreArray = new Score[3];
        /*1. score 객체 자체가 만들어진 것이 아니다.
        * score 객체를 참조하는 참조형 변수 scoreArray가 만들어진 것이다.
        * 참조형 변수가 배열로 만들어지면 참조형 변수의 기본값인 null로 초기화됨*/


//        scoreArray[0].printInfo();  nullPointException
        scoreArray[0] = new Score(1, 99, 80, 89);
        scoreArray[1] = new Score(2, 60, 70, 130);
        scoreArray[2] = new Score(3, 50, 40, 90);

        for(int i=0; i<scoreArray.length; i++){
            scoreArray[i].printInfo();
            System.out.println();
        }

    }
}
