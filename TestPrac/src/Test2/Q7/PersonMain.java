package Test2.Q7;

public class PersonMain {
    public static void main(String[] args) {
        Student student1 = new Student("Hello","a1234", 3);
        Person student2 = new Student("Buogiorno", "allora", 4);
        Person student3 = new Person("super", "star");

        student1.disp();
        student2.disp();
        if(student2 instanceof Student){
            Student student22 = (Student) student2;
            student22.disp();
        }
        student3.disp();
    }
}
