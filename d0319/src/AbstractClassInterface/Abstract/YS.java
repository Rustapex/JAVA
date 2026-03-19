package AbstractClassInterface.Abstract;

public class YS extends AcornStudent {

    public YS(){
        super("손영석");
    }
    public YS(String name){
        super(name);
    }

    @Override
    public void study(){
        System.out.println("자바를 공부한다.");
    }
    @Override
    public void dance(){
        System.out.println("어깨춤을 춘다.");
    }
    public void clean(){
        System.out.println("청소을 한다.");
    }
}
