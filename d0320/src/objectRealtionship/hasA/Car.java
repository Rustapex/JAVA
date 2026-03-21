package objectRealtionship.hasA;

public class Car {

    private String carName;
    private Engine engine;   // Car has a Engine

    public Car() {
        this.carName = "기본 자동차";
        this.engine = new Engine();
    }

    public Car(String carName, Engine engine) {
        this.carName = carName;
        this.engine = engine;
    }

    public void drive() {
        System.out.println(carName + "가 출발합니다.");
        engine.start();
    }
}