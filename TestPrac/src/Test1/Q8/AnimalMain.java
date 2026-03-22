package Test1.Q8;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[2];
        zoo[0] = new Dog("Doggy"); //업캐스팅
        zoo[1] = new Cat("Catty"); //업캐스팅

        for(int i=0; i<zoo.length; i++){
            zoo[i].sound();
        }

//        if(zoo[0] instanceof Dog){
//            Dog dog2 = (Dog)zoo[0]; 다운캐스팅
//            dog2.sound();
//        }
//        if(zoo[1] instanceof Cat){
//            Cat cat2 = (Cat) zoo[1]; 다운캐스팅
//            cat2.sound();
//        } => 사실 다형성 떄문에 다운캐스팅 안해도 sound 오버라이딩 됨
    }
}
