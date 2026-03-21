package Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        ArrayList<나는게가능한> 나는그룹 = new ArrayList<>();
        ArrayList<많이먹는게가능한> 많이먹는그룹 = new ArrayList<>();
        ArrayList<변신가능한> 변신그룹 = new ArrayList<>();
        ArrayList<불어가능한> 불어그룹 = new ArrayList<>();
        ArrayList<태권도가가능한> 태권도그룹 = new ArrayList<>();



        // 전체 리스트에 저장
        list.add(new 손영석());
        list.add(new 이현겸());
        list.add(new 황스일());
        list.add(new 김민경());


        // 전체 리스트를 돌면서 인터페이스별 분류
        for (int i = 0; i < list.size(); i++) {

            Object o = list.get(i);

            if (o instanceof 나는게가능한) {
                나는그룹.add((나는게가능한) o);
            }
            if (o instanceof 많이먹는게가능한) {
                많이먹는그룹.add((많이먹는게가능한) o);
            }
            if (o instanceof 변신가능한) {
                변신그룹.add((변신가능한) o);
            }
            if (o instanceof 불어가능한) {
                불어그룹.add((불어가능한) o);
            }
            if (o instanceof 태권도가가능한) {
                태권도그룹.add((태권도가가능한) o);
            }
        }

        for (int i = 0; i < 많이먹는그룹.size(); i++) {
            많이먹는그룹.get(i).많이먹다();
        }

    }
}
