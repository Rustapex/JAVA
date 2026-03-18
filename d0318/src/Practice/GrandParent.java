package Practice;

public class GrandParent {
    String name;
    int age;

    public GrandParent(){
        this("King", 70);
    }
    public GrandParent(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("grandParent : hello");
    }
    @Override
    public String toString(){
        return "GrandParent name : " + name + ", age : " + age;
    }
    public void showAllInfo(){
        System.out.println("Grand Parent");
        System.out.println("name : " + name + ", age : "+ age);
    }

}
