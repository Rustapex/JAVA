package packageDef;

public class Student {
    // 속성
    private String name;
    private int kor;
    private int eng;
    private double avg;
    private char grade;

    /*생성자(입력) => 객체의 초기화 역할*/
    public Student(){
        /*기본 생성자*/
    }
    public Student(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        calcStuRes();
    }

    /*method*/
    /*메서드를 통해서 학생성적 정보를 다뤄야 한다.*/

    private void calcStuRes(){
        calcAvg();
        calcGrade();
    }

    // 평균 구하기
    private void calcAvg(){
        int total = this.kor + this.eng;
        this.avg = total / 2.0;
    }

    // 학점 구하기
    private void calcGrade(){
        if(avg >= 90.0){
            grade = 'A';
        } else if(avg >= 80.0){
            grade = 'B';
        } else if( avg >= 70){
            grade = 'C';
        } else{
            grade = 'F';
        }
    }


    /*getter : 작성법 - get + Attribute 규칙 , 속성의 값을 반환 =>비교 연산  */
    public String getName(){
        return name;
    }
    public int getKor(){
        return kor;
    }
    public int getEng(){
        return eng;
    }
    public double getAvg(){
        return avg;
    }
    public char getGrade(){
        return grade;
    }

    /*setter : 작성법 규칙 - set + Attribute 규칙
    * 변경이 필요한 속성에 한해서 만든다.*/
    public void setName(String name){
        this.name = name;
    }
    public void setKor(int kor){
        this.kor = kor;
    }
    public void setEng(int eng){
        this.eng =eng;
    }

    /*객체의 정보를 제공 => String toString() : 현재 객체의 정보를 하나의 문자열로 제공하기*/
    public String toString() {
        return "이름 : " + name + ", 국어 : " + kor + ", 영어 : " + eng +
                ", 평균 : " + avg + ", 학점 : " + grade;
    }

}
