package upCastingDownCasting.polymorphism;

import upCastingDownCasting.Animal;
import upCastingDownCasting.Cat;
import upCastingDownCasting.Dog;

public class ParameterPolymorphism {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Cat();
        animals[1] = new Dog();

        for(int i=0; i<animals.length; i++){
            // 공통 부모 메서드 호출 가능
            animals[i].bark();
        }
    }
    public static void allAnimalsBark(Animal[] animals){
        for (Animal animal : animals) {
            // 공통 부모 메서드 호출 가능
            animal.bark();
        }
    }

}
