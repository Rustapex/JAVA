package objectArray;

public class Score {
    private int no;
    private int kor;
    private int eng;
    private int total;

    public Score(){

    }
    public Score(int no, int kor, int eng, int total){
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.total = total;
    }

    public void printInfo(){
        System.out.println("no : " + no);
        System.out.println("kor : " + kor);
        System.out.println("eng : " + eng) ;
        System.out.println("total : " + total);
    }
}

