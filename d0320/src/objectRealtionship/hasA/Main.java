package objectRealtionship.hasA;

public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine("V6 엔진");
        Car car1 = new Car("소나타", engine1);

        car1.drive();
        System.out.println(car1);
    }
}