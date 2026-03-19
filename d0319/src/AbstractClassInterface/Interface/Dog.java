package AbstractClassInterface.Interface;

public class Dog implements Combat{
    @Override
    public void fight() {
        System.out.println("이빨을 드러내고, 잽싸게 문다.");
    }

    @Override
    public void defense() {
        System.out.println("뒷걸음 친다.");
    }
}
