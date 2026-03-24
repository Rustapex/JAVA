package 실기시험손영석.Q9;

public class Score {
    String name;
    int kor;
    int eng;
    char grade;

    public Score() {
        this.name = "nobody";
        this.kor = 100;
        this.eng = 100;
        this.grade = 'A';
    }

    public Score(String name, int kor, int eng, char grade) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.grade = grade;
    }

    void calGrade() {
        int sum = eng + kor;
        double avg = sum / 2.0;
        if(avg >= 90.0){
            this.grade = 'A';
        } else if(avg >= 80.0){
            this.grade = 'B';
        } else if (avg >= 70.0){
            this.grade = 'C';
        } else{
            this.grade = 'F';
        }
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", kor=" + kor +
                ", eng=" + eng +
                ", grade=" + grade;
    }
}
