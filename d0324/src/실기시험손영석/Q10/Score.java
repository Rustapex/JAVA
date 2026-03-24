package 실기시험손영석.Q10;

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

    public Score(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        calGrade();
    }

    void calGrade() {
        int sum = eng + kor;
        double avg = sum / 2.0;
        if (avg >= 90.0) {
            this.grade = 'A';
        } else if (avg >= 80.0) {
            this.grade = 'B';
        } else if (avg >= 70.0) {
            this.grade = 'C';
        } else {
            this.grade = 'F';
        }
    }

    @Override
    public String toString() {
        return name + "  " + kor + " " + eng + " " + grade;
    }
}
