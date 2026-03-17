package packageDef;

public class studentMain {
    public static void main(String[] args) {

        // (객체)참조형 변수 만들기
        Student student1 = new Student("Risa",100,90); // Student 객체의 정보를 참조할 참조형 변수 선언
        Student student2 = new Student("Isa", 80,40);
        Student student3 = new Student("Paul", 70, 90);

        Student[] students = {student1, student2,student3};

        for(int i=0; i<students.length; i++){
/*
            students[i].calcStuRes();
*/
            System.out.println(students[i].toString());
        }
        student2.setEng(65);
        /*student2.calcStuRes();*/
        System.out.println("이의 신청 이후 eng : 60");
        System.out.println(students[1].toString());

        /*student1.calcStuRes();

        System.out.printf("grade : %s%n", student1.getGrade());
        System.out.println(student1.toString());


        System.out.println("영어 : 60, 국어 : 80 으로 변경");
        student1.setEng(60);
        student1.setKor(80);
        student1.calcStuRes();

        System.out.println(student1.getName());
        System.out.println(student1.toString());*/
    }
}
