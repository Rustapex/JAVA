package Test2.Q8;

public class Car {
    protected  String name;
    protected  int velocity;

    public Car() {
        this.name = "CarName";
        this.velocity = 0;
    }

    public Car(String name, int velocity) {
        this.name = name;
        this.velocity = velocity;
    }

    public void speedUp(){
        this.velocity +=1;
    }
    public void disp(){
        System.out.printf("name : %s, velocity : %d%n", this.name,this.velocity);
    }
}
