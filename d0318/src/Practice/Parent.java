package Practice;

public class Parent extends GrandParent {
    String job;

    public Parent(){
        this("KingSon", 40, "doctor");
    }
    public Parent(String name, int age, String job){
        super(name,age);
        this.job = job;
    }

    public void work(){
        System.out.println("work");
    }

    @Override
    public void sayHello(){
        System.out.println("parent : hello");
    }

    @Override
    public String toString() {
        return "Parent name : " + name + ", age : " + age + ", job : " + job;
    }

    @Override
    public void showAllInfo(){
        super.showAllInfo(); //GrandParent 정보
        System.out.println("Parent");
        System.out.println("name : " + name + ", age : " + age + ", job : " + job); // parent 정보
    }
}
