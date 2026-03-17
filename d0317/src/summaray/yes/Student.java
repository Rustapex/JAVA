package summaray.yes;

public class Student extends Person {

    public Student(String name,int age, int stress){
        super(name,age,stress);
    }

    public void study(){
        stress +=40;
    }

}
