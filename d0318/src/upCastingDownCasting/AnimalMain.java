package upCastingDownCasting;

/* 상속 extends 키워드 사용 */
/* 물려 주는 쪽 : 부모 클래스(super class)
 * 물려 받는 쪽 : 자식 클래스(sub class)
 *
 * 자식 클래스는 부모의 속성과 메서드를 물려받는다.
 */

/*
1. new 에 의해 Cat 타입 객체가 메모리에 생성된다.
2. new 가 반환한 객체의 참조값(주소값)을 참조변수에 저장한다.
3. 참조변수의 타입은 "그 대상을 어떤 범위까지 볼 수 있는지"를 결정한다.
   - Cat 타입 참조변수 : Cat 고유 기능 + 부모 기능까지 사용 가능
   - Animal 타입 참조변수 : Animal 범위의 기능만 사용 가능
*/

public class AnimalMain {
    public static void main(String[] args) {

        // 1. 기본 객체 생성
        Cat cat1 = new Cat();
        cat1.catchRat();   // Cat 클래스의 고유 메서드
        cat1.bark();       // Animal 로부터 상속받은 메서드

        // 2. 업캐스팅 : 자식 객체를 부모 타입 참조변수로 받기
        Animal cat2 = new Cat();
        cat2.bark();
        // cat2.catchRat(); // 불가능
        // 이유: 실제 객체는 Cat 이지만, 참조변수 타입이 Animal 이므로
        // Animal 에 정의된 범위까지만 접근 가능

        // 3. 기본 객체 생성
        Dog dog1 = new Dog();
        dog1.bark();         // 부모 Animal 의 메서드
        dog1.protectHome();  // Dog 의 고유 메서드

        // 4. 업캐스팅
        Animal dog2 = new Dog();
        dog2.bark();

        // 5. 다운캐스팅
        // dog2 의 실제 객체가 Dog 인지 먼저 확인한 뒤에 Dog 로 변환
        if (dog2 instanceof Dog) {
            Dog downDog = (Dog) dog2;
            downDog.protectHome();
            downDog.bark();
        }

        // 6. 업캐스팅 예시
        Cat cat4 = new Cat();
        Animal cat5 = cat4;
        cat5.bark();

        // 7. 잘못된 다운캐스팅 예시
        Animal cat6 = new Animal();
        // Cat cat7 = (Cat) cat6;
        // 컴파일은 될 수 있지만, 실행하면 ClassCastException 발생 가능
        // 이유: 실제 객체가 Cat 이 아니라 Animal 이기 때문


        Animal[] animalArray = new Animal[2];
        animalArray[0] = new Cat(); // Cat -> Animal 업캐스팅
        animalArray[1] = new Dog(); // Dog -> Animal 업캐스팅

        for (int i = 0; i < animalArray.length; i++) {

            // 공통 부모 메서드 호출 가능
            animalArray[i].bark();

            if (i == 0) {
                // animalArray[0] 은 실제로 Cat 객체를 가리킴
                if (animalArray[i] instanceof Cat) {
                    Cat cat = (Cat) animalArray[i]; // 다운캐스팅
                    cat.catchRat();
                }
            } else if (i == 1) {
                // animalArray[1] 은 실제로 Dog 객체를 가리킴
                if (animalArray[i] instanceof Dog) {
                    Dog dog = (Dog) animalArray[i]; // 다운캐스팅
                    dog.protectHome();
                }
            }
        }
    }
}