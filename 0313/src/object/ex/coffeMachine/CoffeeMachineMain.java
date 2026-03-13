package object.ex.coffeMachine;

public class CoffeeMachineMain {
    public static void main(String[] args) {

        CoffeeMachine a = new CoffeeMachine();
        a.printOut(); //printOut() 호출 될 때에 객체정보가 전달된다.
        a.getMilkCoffee(500);
        a.printOut();
        a.getMilkCoffee(500);
        a.printOut();
        a.refill();
        a.printOut();
    }
}
