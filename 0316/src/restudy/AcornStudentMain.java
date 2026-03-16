package restudy;

public class AcornStudentMain {
    public static void main(String[] args) {

/*        AcornStudent s = new AcornStudent();
        AcornStudent s2 = new AcornStudent();*/
        AcornStudent YS = new AcornStudent();

        /*input*/
/*        s.input("Isa", 1000,10,50,200, 0);
        s2.input("matteo", 2000, 20, 0, 0, 10 );*/
        YS.input("yeongseok", 500, 50, 50, 50, 50);

        System.out.println("처음 상태");
        YS.printInfo();
        YS.studyArray();
        YS.studyObject();

        System.out.println("객체, 배열 공부 후 상태");
        YS.printInfo();
       /* s.printInfo();
        s2.printInfo();

        s.eat();
        s2.eat();

        s.printInfo();
        s2.printInfo();

        s.studyArray();
        s2.studyArray();
*/
        // s.performance = 50000; private로 외부 접근 말고 정해진 방법으로만 자바 능력치 올라가게 함.

       /* s.studyArray();
        s.printInfo();
        s2.printInfo();*/

    }
}
