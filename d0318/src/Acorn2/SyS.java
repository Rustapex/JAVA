package Acorn2;

public class SyS extends AcornStudent{

    public SyS(){
        this("손영석", 24);
    }

    public SyS(String name, int age){
        super(name,age);
    }
    @Override
    public void 음료마시기(){
        System.out.println("손영석은 아이스티가 먹고싶습니다.");
    }
    @Override
    public String toString(){
        return "name : " + name + ", age : " + age;
    }

}
