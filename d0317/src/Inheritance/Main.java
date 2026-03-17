package Inheritance;

import Inheritance.Professor;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.walk();
        student1.study();

        StudentWorker sw1 = new StudentWorker();
        sw1.walk();
        sw1.work();

        Research research = new Research();
        research.walk();
        research.research();

        Professor professor = new Professor();
        professor.walk();
        professor.teach();

        Person[] persons = new Person[4];
        persons[0] = student1;
        persons[1] = sw1;
        persons[2] = research;
        persons[3] = professor;
    }
}
