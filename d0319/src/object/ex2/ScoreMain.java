package object.ex2;

public class ScoreMain {
    public static void main(String[] args) {
        Score s1 = new Score();
        Score s2 = new Score("Powl",20,30);

        Object o = s2;

        System.out.println(o); //toString() 하면 "Powl" 20 30 이렇게 나옴 다형성
        /*Object - toString()
        * Score - toString() override[부모 method 와 동일할 경우]
        * Object 로 다뤄도 실제 생성된 객체의 toString()이 동작*/

        System.out.println(s1);
        System.out.println(s2);
//        System.out.println(s.toString());
    }
}
