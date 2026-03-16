package constructor;
// 객체지향
/*1. 캡슐화
* 2. 상속
* 3. 다형성*/


/*1. 데이터 + 데이터를 다루는 함수(기능)
* 2. 객체의 정보를 정해진 방법(method)를 통해서만 변경하여 객체의 속성(데이터)가 잘못 변경되는 것을 막겠다.
*
* 1) 접근 제한자
* 2) 생성자 : method와 동일하다 (특별한 method : 단 한번 new에 의해서 생성될 때에 호출되는 특별한 method)
*           - 변수(객체)dml 값을 초기화
*           - 별도로 호출 불가
*
* 객체 자료형 s = new 객체();
* s = null; // null : 참조형 변수의 기본값, null 은 아직 아무것도 참조하고 있지 않다는 의미
* s(참조형 변수)가 사라지면 객체의 주소를 저장하는 변수가 사라지면 G-C의 대상이 된다.
*
* 생성자
* 값의 입력은 필요하고 값의 입력이 여러 번 호출되는 것 불필요 => 값의 초기화를 담당하는 단 한번 호출되는 특별 메서드 제공
* <생성자 규칙>
*   - 기본 생성자   : public Constructor() {}
*   - 초기화       : public Constructor(String encapsulation, String inheritance, String polymorphism){}
*   - 생성자 끼리 호출 할 수 있다.
*   - 생성자 overloading 가능
 * */

public class Constructor {

    private String encapsulation;
    private String inheritance;
    private String polymorphism;

    /*생성자 overloading*/
    public Constructor(String encapsulation, String inheritance, String polymorphism){
        this.encapsulation = encapsulation;
        this.inheritance = inheritance;
        this.polymorphism = polymorphism;

    }

    public Constructor(String encapsulation, String inheritance){
        this.encapsulation = encapsulation;
        this.inheritance = inheritance;
        this.polymorphism = "overloadingPractice";

    }

    public String getEncapsulation() {
        return encapsulation;
    }

    public String getInheritance() {
        return inheritance;
    }

    public String getPolymorphism() {
        return polymorphism;
    }

    public void printInfo() {
        System.out.println("encapsulation = " + encapsulation);
        System.out.println("inheritance = " + inheritance);
        System.out.println("polymorphism = " + polymorphism);
    }
}
