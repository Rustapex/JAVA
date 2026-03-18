package upCastingDownCasting;

public class Dog extends Animal {
    public void protectHome(){
        System.out.println("집 지키기");
    }
    @Override
    public void bark(){
        System.out.println("강아지가 짖습니다.");
    }

}
