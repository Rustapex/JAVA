package Test1.Q7;

public class Student {
    String name;
    int kor;
    int eng;

    public Student(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

//    getter
    public String getName() {
        return name;
    }

    public double avgStudent(){
        return (this.kor + this.eng) / 2.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                '}';
    }
}
