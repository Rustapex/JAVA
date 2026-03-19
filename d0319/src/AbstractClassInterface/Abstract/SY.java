package AbstractClassInterface.Abstract;

public class SY extends AcornStudent {

    public SY(){
        super("Isa");
    }
    public SY(String name){
        super(name);
    }

    @Override
    public void study(){
        System.out.println("Oracle를 공부한다.");
    }
    @Override
    public void dance(){
        System.out.println("탈춤을 춘다.");
    }
    public void work(){
        System.out.println("고된 일을 한다.");
    }
}
