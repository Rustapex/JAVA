package object.ex.grade;

public class Student {
    String name;
    int kor;
    int eng;
    double avg; // 평균 구하기
    /*기능 (입력, 성적처리, 출력)*/

    /*객체 method 만들기 static 제거*/
    public void input(String name, int kor, int eng){
        this.name = name;
        this.kor = kor;
        this.eng = eng;

        calc();
    }

    /*평균 구하기(성적처리)*/
    private void calc(){
        int total = this.kor + this.eng;
        this.avg = (double) total / 2;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.kor);
        System.out.println(this.eng);
        System.out.println(this.avg);
    }
}
