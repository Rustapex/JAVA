package object.ex1;

public class A {

    public void methodA(){
        System.out.println("A의 메서드");
    }

    @Override
    public String toString() {
        return super.toString() + " 클래스 정보";
    }
}
