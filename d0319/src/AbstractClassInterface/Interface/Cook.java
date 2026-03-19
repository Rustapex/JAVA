package AbstractClassInterface.Interface;

public class Cook implements Combat {

    @Override
    public void fight() {
        System.out.println("국자를 던진다.");
    }

    @Override
    public void defense() {
        System.out.println("후라이팬으로 막는다.");
    }
}
