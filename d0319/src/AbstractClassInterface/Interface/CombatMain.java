package AbstractClassInterface.Interface;

public class CombatMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cook cook = new Cook();

        //  cat, dog ,cook extends Combat interface
        Combat[] combats = {cat, dog, cook};

        for (Combat combat : combats) {
            if(combat instanceof Cat){
                combat.fight();
                combat.defense();
            } else if(combat instanceof Dog){
                combat.fight();
                combat.defense();
            } else if (combat instanceof Cook){
                combat.fight();
                combat.defense();
            } else{
                combat.defense();
                combat.fight();
            }

        }

    }
}
