package summaray.no;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Isa",30,200);
        Student s1 = new Student("Rico", 20, 100);
        p1.personInfo();
        p1.exercise();
        p1.personInfo();

        System.out.println();
        s1.personInfo();
        s1.exercise();
        s1.study();
        s1.personInfo();

    }
}
