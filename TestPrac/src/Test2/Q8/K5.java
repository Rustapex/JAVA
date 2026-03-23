package Test2.Q8;

public class K5 extends Car{
    public K5(){
        super();
    }
    public K5(String name, int velocity){
        super(name, velocity);
    }

    @Override
    public void speedUp(){
        this.velocity +=5;
    }
    @Override
    public void disp(){
        System.out.println("K5");
        System.out.printf("name : %s, velocity : %d%n", this.name,this.velocity);
    }
}
