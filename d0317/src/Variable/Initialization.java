package Variable;

public class Initialization {
    public static void main(String[] args) {

/*
변수와 접근제어자, static, 상속 관련 정리

1. 지역변수(local variable)
- 메서드, 생성자, 블록(if, for, while 등) 내부에서 선언되는 변수
- 선언된 블록이 실행될 때 생성되고, 블록이 끝나면 사라짐
- 보통 stack 영역에서 관리된다고 배움
- 반드시 직접 초기화한 후 사용해야 함
- 접근제어자(public, private, protected 등)를 붙일 수 없음
- static도 붙일 수 없음

2. 인스턴스변수(instance variable, member variable, field)
- 클래스 내부에 선언되지만 static이 없는 변수
- 객체 생성(new) 시 객체와 함께 생성됨
- 각 객체마다 독립적으로 따로 존재함
- 객체의 상태(속성, 데이터)를 저장함
- 객체가 더 이상 참조되지 않으면 GC(가비지 컬렉션) 대상이 될 수 있음
- 자동으로 기본값(default value)으로 초기화됨

3. 정적변수(static variable, class variable)
- 클래스 내부에서 static 키워드를 붙여 선언한 변수
- 객체마다 따로 생성되지 않고 클래스당 하나만 존재함
- 클래스가 메모리에 로딩될 때 생성됨
- 프로그램 종료 시까지(정확히는 클래스 언로드 전까지) 유지됨
- 모든 객체가 공유하는 공통 데이터 저장에 사용함
- 자동으로 기본값(default value)으로 초기화됨

4. 작성 위치
- 지역변수: 메서드/생성자/블록 내부
- 인스턴스변수: 클래스 내부
- 정적변수: 클래스 내부

5. 접근제어자(access modifier)
(1) public
- 어디서든 접근 가능
- 다른 패키지에서도 접근 가능

(2) private
- 같은 클래스 내부에서만 접근 가능
- 외부 클래스에서는 직접 접근 불가
- 데이터를 보호(캡슐화)할 때 많이 사용
- 보통 getter/setter 메서드를 통해 간접 접근함

(3) default(package-private) : 아무것도 안 쓴 경우
- 같은 패키지 내부에서만 접근 가능
- 다른 패키지에서는 접근 불가

(4) protected
- 같은 패키지에서 접근 가능
- 다른 패키지라도 상속 관계의 자식 클래스에서는 접근 가능
- 상속을 고려한 멤버에 사용됨

6. static의 의미
- static이 붙으면 객체 소속이 아니라 클래스 소속이 됨
- 따라서 객체를 만들지 않아도 클래스 이름으로 접근 가능
- 공용 데이터나 공용 기능을 만들 때 사용함

예)
ClassName.staticVariable
ClassName.staticMethod()

7. 호출 방법
(1) 인스턴스변수 / 인스턴스메서드
- 객체를 생성한 뒤 참조변수로 호출
예)
Student s = new Student();
s.name
s.printInfo()

(2) 정적변수 / 정적메서드
- 클래스 이름으로 호출
예)
Student.count
Student.showCount()

8. static 메서드 내부에서의 접근
- static 메서드는 객체 없이 실행되므로, 인스턴스변수나 인스턴스메서드에 바로 접근할 수 없음
- static 메서드 안에서는 static 멤버만 바로 사용 가능
- 인스턴스 멤버를 사용하려면 객체를 직접 생성하거나 참조를 받아야 함

9. 상속(inheritance)
- 기존 클래스의 속성과 기능을 새로운 클래스가 물려받는 것
- 공통 코드를 재사용할 수 있고, 중복을 줄일 수 있음
- 부모 클래스(상위 클래스, super class)의 멤버를 자식 클래스(하위 클래스, sub class)가 이어받음
- 자식 클래스는 부모의 public, protected 멤버를 사용할 수 있음
- private 멤버는 상속되더라도 자식 클래스에서 직접 접근할 수 없음

10. 변수의 기본값(default value)
(1) 인스턴스변수 / static변수
- 자동 초기화됨

기본값 예시
- byte, short, int -> 0
- long -> 0L
- float -> 0.0f
- double -> 0.0
- char -> '\u0000'
- boolean -> false
- 참조형(String, 배열, 객체 등) -> null

(2) 지역변수
- 자동 초기화되지 않음
- 반드시 직접 값을 넣은 후 사용해야 함
*/
    }
}
