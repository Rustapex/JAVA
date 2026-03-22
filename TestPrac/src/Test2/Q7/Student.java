package Test2.Q7;

public class Student extends Person{ //Person 클래스로 부터 상속받음
    int classNo;

    public Student(){
        super();
        this.classNo = -1;
    }

    public Student(String name, String id, int classNo){
        super(name, id); // Person 생성자 호출해 Person 필드에 접근 가능
        this.classNo = classNo;
        System.out.println("Student 클래스 생성자 호출");
    }

    @Override
    public void disp(){
        System.out.printf("name : %s, id : %s, classNo : %d%n", name, id,classNo);
    }
}
