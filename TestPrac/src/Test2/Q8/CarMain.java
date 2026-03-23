package Test2.Q8;

public class CarMain {
    public static void main(String[] args) {
        Car[] cars = new Car[2];

        cars[0] = new K5("k5", 10);
        cars[1] = new SantaFeCar("santaFe", 20);


        for(int i=0; i<cars.length; i++){
            cars[i].disp();
            cars[i].speedUp();
            cars[i].disp();
        }

    }
}
