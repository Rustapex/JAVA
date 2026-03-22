package Test1.Q8;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
