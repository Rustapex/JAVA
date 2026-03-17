package summaray.no;

public class Student {
    String name;
    int age;
    int stress;

    public Student(){

    }
    public Student(String name, int age, int stress){
        this.name= name;
        this.age = age;
        this.stress = stress;
    }

    public void exercise(){
        stress -= 20;
    }
    public void study(){
        stress += 40;
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
