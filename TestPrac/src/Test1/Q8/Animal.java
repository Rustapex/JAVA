package Test1.Q8;

public class Animal {
    String name;

    public Animal(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void sound(){
        System.out.println("대충 울음소리");
    }
}
