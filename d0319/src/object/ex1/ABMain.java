package object.ex1;

public class ABMain {
    // 클래스가 상속을 받지 않으면 자바는 무조건 object를 상속받게 함.
    public static void main(String[] args) {
        Object o1 = new A();
        A a1 = new A();
        B b1 = new B();

        // 두 개의 객체는 부모 타입으로 다룰 수 있다. upcasting
        // object 만큼 해석, 실체가 바뀌지 않음
        // 필요하면 다운캐스팅해서 고유의 기능을 사용할 수 있다.
        Object[] arr = {a1, b1};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]); // toString Method 생략된 형태로 가능
//            System.out.println(arr[i].toString()); 본래 형태
        }

        /*
        객체의 정보를 문자열로 반환(toString())
        => 자식들의 객체에 전달하기 위해서는 올바르게 override 해야 함.
        toString() method 부모에 있는 매서드로 상속받은 것임 className@hasCode

        객체가 최소한 자신의 정보를 제공할 수 있도록 해야한다.
        (= 상속받은 toString()을 override 해야 함.)
        */
    }
}
