package staticObjectMethod;

/*
* object Method : 객체를 사용하는 메서드 , 변수를 메서드를 통해서만 사용해야 한다.
* 선언 : static을 쓰지 않은 method
* how to call : Class 로 new 해서 객체 생성 , 그 이후 참조형 변수.method명
* A a = new A();
* a.methodName();
*
* */

public class MethodPrac2 {
    public void method1(){
        System.out.println("method1() 실행");
    }
}
