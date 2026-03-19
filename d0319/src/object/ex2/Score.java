package object.ex2;
/*
* 학생 정보를 만들어내기 위한 틀 작성
* Attribute(field) + method => object
* method    => object */

public class Score {
    String name;
    int kor;
    int eng;
    double avg;

    // 생성자
    public Score() {
        this.name = "nobody";
        this.kor = 0;
        this.eng = 0;
        this.avg = 0.0;
    }
    public Score(String name,int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.calc();
    }

    private void calc(){
        int total = kor+eng;
        avg = total/ 2.0;
    }

    @Override
    public String toString() {
        return "Score{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", avg=" + avg +
                '}';
    }
}
