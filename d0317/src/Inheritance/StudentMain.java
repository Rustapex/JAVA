package Inheritance;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("=== Student ===");
        student1.talk();
        student1.eat();
        student1.walk();
        student1.sleep();
        student1.study();

        System.out.println();

        StudentWorker studentWorker1 = new StudentWorker();
        System.out.println("=== StudentWorker ===");
        studentWorker1.talk();
        studentWorker1.eat();
        studentWorker1.walk();
        studentWorker1.sleep();
        studentWorker1.study();
        studentWorker1.work();
    }
}