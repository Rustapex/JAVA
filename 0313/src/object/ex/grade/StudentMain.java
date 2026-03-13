package object.ex.grade;

public class StudentMain {
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println("이름, 국어성적, 영어성적 순으로 입력");
        s.input("Alice", 100, 99);
        s.print();

    }
}
