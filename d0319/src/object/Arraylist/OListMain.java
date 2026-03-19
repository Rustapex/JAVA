package object.Arraylist;

public class OListMain {
    public static void main(String[] args) {
        OList list = new OList();
        list.add(new Score("Queen", 90, 20));
        list.add(new Score("King", 100, 50));
        list.add(new Score("Knight", 80, 70));

        for(int i=0; i<list.size(); i++){
            Object o = list.get(i);
            System.out.println(o);

            //score 객체의 고유 method 사용
            Score score = (Score) o;
            System.out.println(score);
        }
    }
}
