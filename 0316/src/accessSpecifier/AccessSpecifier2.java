package accessSpecifier;
/*
클래스의 "전체 이름"은
패키지명 + 클래스명 으로 이루어진다.

예를 들어
constructor 패키지 안에 Constructor 클래스가 있으면

전체 이름(풀네임, fully qualified name)은
constructor.Constructor

이 된다.

즉,
클래스 이름 => 패키지를 포함한 전체 이름으로 생각할 수 있다.
다만 같은 패키지 안에서는 패키지명을 생략하고 클래스명만 써도 된다.
*/

// import 방식
// 다른 패키지의 클래스를 자주 사용할 때는 import로 미리 가져올 수 있다.
// import를 해두면 코드 안에서 패키지명을 매번 쓰지 않고 클래스명만 사용 가능하다.
// 아래 한 줄은 constructor 패키지의 Constructor 클래스를 가져온다는 뜻이다.
import constructor.Constructor;

public class AccessSpecifier2 {
    public static void main(String[] args) {

         /*
        1. 같은 패키지의 클래스 사용

        AccessModifier 클래스는 현재 이 파일과 같은
        accessSpecifier 패키지 안에 있으므로
        패키지명을 생략하고 클래스명만 써도 된다.
        */

        // 패키지명 생략
        AccessModifier obj1 = new AccessModifier();

        // 풀네임
        accessSpecifier.AccessModifier obj2 = new accessSpecifier.AccessModifier();

        // System.out.println(obj1.a); // private -> 불가능(외부에서 접근 불가)
        System.out.println(obj1.b); // public -> 가능
        System.out.println(obj1.c); // default -> 같은 패키지라 가능



        /*
        2. 다른 패키지의 클래스를 "패키지 전체를 명시"해서 사용하는 방법

        constructor 패키지의 Constructor 클래스를 사용할 때
        import를 하지 않았다면 아래처럼
        패키지명.클래스명 형태로 전부 써야 한다.

        constructor.Constructor
        ↑ 패키지명     ↑ 클래스명

        이 방식은
        "아 이 클래스는 constructor 패키지에 있는 Constructor구나"
        를 코드에 직접 드러내는 방식이다.
        */

        // 다른 패키지 constructor 의 Constructor 클래스를 풀네임으로 사용
        constructor.Constructor obj3 =
                new constructor.Constructor("캡슐화", "상속", "다형성");

        System.out.println(obj3.getEncapsulation());
        System.out.println(obj3.getInheritance());
        System.out.println(obj3.getPolymorphism());

        obj3.printInfo();

        /*
        같은 패키지라면 패키지명 생략가능
        다른 패키지라면 직접 명시 or import 해야함
        */
    }
}


/*
        정리

        다른 패키지 클래스 사용 방법은 2가지다.

        (1) 패키지명까지 전부 직접 쓰기
            constructor.Constructor obj = new constructor.Constructor(...);

        (2) import 해두고 클래스명만 쓰기
            import constructor.Constructor;
            Constructor obj = new Constructor(...);

        둘 다 같은 클래스를 사용하는 것이고,
        차이는 "패키지명을 코드에 매번 직접 쓰느냐"
        "맨 위에서 import 해놓고 짧게 쓰느냐" 이다.
        */
/*
클래스의 전체 이름은 패키지명을 포함한 이름이다.
예: constructor.Constructor

같은 패키지의 클래스는 클래스명만으로 사용할 수 있다.
다른 패키지의 클래스는
1) 패키지명.클래스명 으로 직접 명시하거나
2) import로 가져온 뒤 클래스명만 사용할 수 있다.
*/
