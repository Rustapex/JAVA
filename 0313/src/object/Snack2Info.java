package object;

public class Snack2Info {
    public static void main(String[] args) {

        Snack2 s = new Snack2();
        // s는 객체 자체가 아니라, Snack2 객체를 가리키는 참조형 변수이다.
        // new Snack2()로 객체를 생성하고, 그 객체의 참조값을 변수 s에 저장한다.

        s.input("맛동산", "해태", 300, 50);
        s.print();
    }



}
