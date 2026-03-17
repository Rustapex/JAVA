package summaray.no;

public class Professor {
    String name;
    int age;
    int stress;
    public Professor(String name, int age, int stress){
        this.name= name;
        this.age = age;
        this.stress = stress;
    }

    public void exercise(){
        stress -= 20;
    }
    public void teach(){
        stress += 10;
    }
    public void eat(){
        stress -=20;
    }
    public void personInfo(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("stress : " + stress);
    }
}
