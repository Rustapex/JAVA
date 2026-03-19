package AbstractClassInterface.Interface;

public class Cat implements Combat{

    @Override
    public void fight() {
        System.out.println("발톱을 드러내고 싸운다.");
    }

    @Override
    public void defense() {
        System.out.println("높게 점프를 뛴다.");
    }
}
