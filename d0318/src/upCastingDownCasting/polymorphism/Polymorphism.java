package upCastingDownCasting.polymorphism;
/* 상속 관계에서 발생함.

         부모 타입으로 자식을 다루면서 고유의 동작을 실행하게 하는 것.
        */

// 다형성을 얻으려면
/* 1. 상속관계여야 한다.(is-a 관계)
 *  2. 부모의 메서드를 재정의 해야 한다.(override)
 *
 *  Cat => Animal
 * */

import upCastingDownCasting.Animal;
import upCastingDownCasting.Cat;
import upCastingDownCasting.Dog;

public class Polymorphism {
    public static void main(String[] args) {

        Cat cat = new Cat();
        method1(cat);

        Dog dog = new Dog();
        method1(dog);
    }
    public static void method1(Cat cat){
        method2(cat);
    }
    //overloading
    public static void method1(Dog dog){
        method2(dog);
    }
    public static void method2(Animal animal){
        animal.bark();
        if(animal instanceof Cat){
            ((Cat)animal).catchRat();
        }
        if(animal instanceof Dog){
            ((Dog)animal).protectHome();
        }
    }
}
