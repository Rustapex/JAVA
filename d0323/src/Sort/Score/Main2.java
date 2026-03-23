package Sort.Score;

import MyArray.MyComparable;

public class Main2 {
    public static void main(String[] args) {

        Score[] scores  = new Score[5];

        scores[0] = new Score("김민경" , 100,80);
        scores[1] = new Score("송주창" , 70,85);
        scores[2] = new Score("손영석" , 99,79);
        scores[3] = new Score("나해수" , 85,70);
        scores[4] = new Score("김건희" , 88,89);



        // interface를 상속받은 익명 클래스 만들기
        MyArrays.sort(scores, new MyComparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Score s1 = (Score) o1;
                Score s2 = (Score) o2;

                return s1.eng - s2.eng;
            }
        });

        System.out.println("영어점수 오름차순");
        for (Score score : scores) {
            System.out.println(score);
        }

        //지역 내부 클래스(메서드 안에서 클래스를 먼저 만들고 사용할 수 있다.)
        class A implements MyComparator {
            @Override
            public int compare(Object o1, Object o2){
                Score s1 = (Score) o1;
                Score s2 = (Score) o2;
                return s1.kor - s2.kor;
            }
        }
        MyArrays.sort(scores, new A());

        System.out.println("국어점수 오름차순");
        for (Score score : scores) {
            System.out.println(score);
        }

    }
}
