package object.Arraylist;

import java.sql.SQLOutput;

public class GListMain {
    public static void main(String[] args) {
        GList<Score> list = new GList<>();
        list.add(new Score("Queen", 90, 20));
        list.add(new Score("King", 100, 50));
        list.add(new Score("Knight", 80, 70));

        for(int i=0; i<list.size(); i++){
             Score s = list.get(i);
            System.out.println(s);
            s.printInfo();
        }
    }
}
