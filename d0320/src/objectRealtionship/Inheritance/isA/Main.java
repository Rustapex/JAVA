package objectRealtionship.Inheritance.isA;

public class Main {
    public static void main(String[] args) {
        B b1 = new B();
        A a1 = new B();

        b1.AMethod(); // 부모 A에게서 물려받은 메서드
        b1.BMethod(); // B 자신의 메서드

        a1.AMethod();
        if(a1 instanceof B){
            B b2 = (B)a1;
            b2.BMethod();
        }
    }
}