package upCastingDownCasting;

public class Cat extends Animal {
    public void catchRat(){
        System.out.println("쥐 잡기");
    }
    @Override
    public void bark(){
        System.out.println("고양이가 웁니다.");
    }
}
