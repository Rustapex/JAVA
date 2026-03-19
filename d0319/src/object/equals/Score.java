package object.equals;

import javax.print.attribute.standard.MediaSize;

public class Score {
    String name;
    int kor;
    int eng;

    public Score() {
//        super()
    }

    // 생성자
    public Score(String name,int kor, int eng) {
//        super();
        this.eng = eng;
        this.kor = kor;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Score{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                '}';
    }
    @Override
    public boolean equals(Object object){ //upcasting
        /* libaray 대부분 object parameter*/
        boolean result = false;
        if(object instanceof Score){
            Score other = (Score) object;
            if(this.kor == other.kor && this.eng == other.eng){
                result = true;
            }

        }

        return result;
    }
}
