package object.equals;

public class ScoreMain2 {
    public static void main(String[] args) {
        Score s = new Score("Risa", 100, 90);
        Score s2 = new Score("Allora", 80, 70);

        // 두 객체의 비교
        /*Object -> equals() method가 존재한다. : 조소값을 비교한다.
        * */

        // equals() override 해야 사용 가능
        if(s.equals(s2)){ // false - 이유 : 생성된 객체의 주소를 비교하니까
            System.out.println("두 객체는 같다.");
        } else{
            System.out.println("두 객체는 같지 않다.");
        }

    }
}
