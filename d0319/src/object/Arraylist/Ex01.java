package object.Arraylist;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {

        //객체 배열 대신에 Arraylist 사용하기
        /*순서가 있다.
        * 중복된 데이터를 저장할 수 있다.
        * 배열과 같은 구조라고 생각하면 된다.*/

        ArrayList list = new ArrayList();
        list.add(new Score("Paul",100,80));
        list.add(new Score("Lisa",90,70));
        list.add(new Score("Zelra",80,80));
        list.add(new Score("wolf",100,100));

        for(int i=0; i<list.size(); i++){
            Object item = list.get(i);
            System.out.println(item); //다형성
            // 다운캐스팅 => Score 객체의 고유의 기능을 사용하기 위해서는 다운캐스팅 해야한다.

            Score itemScore = (Score) item; // 다운캐스팅
            itemScore.printInfo();
        }
    }
}
