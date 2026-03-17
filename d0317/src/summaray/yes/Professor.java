package summaray.yes;

public class Professor extends Person {

    public Professor(String name, int age, int stress){
        super(name, age, stress);
    }

    @Override
    public void exercise(){
        System.out.println("운동합니다.");
        stress -= 100;
    }

    public void teach(){
        stress += 10;
    }


}
