package objectRealtionship.hasA;

public class Engine {

    private String engineName;

    public Engine() {
        this.engineName = "기본 엔진";
    }

    public Engine(String engineName) {
        this.engineName = engineName;
    }

    public void start() {
        System.out.println(engineName + " 시동 걸림");
    }
}