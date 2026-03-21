package objectRealtionship.use;

public class Printer {
    private String model;

    public Printer(String model) {
        this.model = model;
    }

    public void print() {
        System.out.println(model + "로 출력합니다.");
    }
}