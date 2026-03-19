package AbstractClassInterface.Abstract;

public class 손영석 {
    private String name;

    public 손영석(){
        this("손영석");
    }
    public 손영석(String name){
        this.name = name;
    }


    public void 공부한다(){
        System.out.println("자바를 공부한다.");
    }
    public void 춤춘다(){
        System.out.println("어깨춤을 춘다.");
    }
    public void 청소한다(){
        System.out.println("청소을 한다.");
    }
}
