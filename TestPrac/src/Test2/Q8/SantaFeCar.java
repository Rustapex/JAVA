package Test2.Q8;

public class SantaFeCar extends Car{
    public SantaFeCar(){
        super();
    }
    public SantaFeCar(String name, int velocity){
        super(name, velocity);
    }

    @Override
    public void speedUp(){
        this.velocity +=10;
    }
    @Override
    public void disp(){
        System.out.println("SantaFe Car");
        System.out.printf("name : %s, velocity : %d%n", this.name,this.velocity);
    }
}
