package Practice;

public class Child extends Parent {
    String school;

    public Child(){
        this("KingSonSon", 18, "student","highSchool");
    }
    public Child(String name, int age, String job, String school){
        super(name,age,job);
        this.school = school;
    }

    public void study() {
        System.out.println("study");
    }

    @Override
    public void sayHello() {
        System.out.println("child : hello");
    }

    @Override
    public String toString() {
        return "Child name : " + name + ", age : " + age + ", job : " + job + ", school : " + school;
    }

    @Override
    public void showAllInfo(){
        super.showAllInfo(); // grandparent , parent  정보
        System.out.println("Child");
        System.out.println("name : " + name + ", age : " + age + ", job : " + job + ", school : " + school);

    }
}
