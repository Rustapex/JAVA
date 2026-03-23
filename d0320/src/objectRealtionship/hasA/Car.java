package objectRealtionship.hasA;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", engineName=" + engine.getEngineName()+
                '}';
    }
}