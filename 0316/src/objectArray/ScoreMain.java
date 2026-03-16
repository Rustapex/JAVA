package objectArray;

public class ScoreMain {
    public static void main(String[] args) {
        Score score1 = new Score(1, 100, 100, 200);
        Score score2 = new Score(2, 80, 90, 170);

        Score[] scores = new Score[2];
        scores[0] = new Score(1, 100, 100, 200);
        scores[1] = new Score(2, 80, 90, 170);

        for(int i=0; i<scores.length;i++){
            scores[i].printInfo();
        }
    }
}
