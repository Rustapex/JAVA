package 실기시험손영석.Q10;

public class ScoreMain {
    public static void main(String[] args) {
        Score[] score = new Score[3];
        score[0] = new Score("이학생", 90, 90);
        score[1] = new Score("김학생", 80, 82);
        score[2] = new Score("전학생", 60, 70);

        for(int i=0; i< score.length; i++){
            System.out.println(score[i]);
        }
    }
}
