package Test2.Q10;

public class Main {
    public static void main(String[] args) {
        MyComparable[] myArrays = new MyComparable[10];

        myArrays[0] = new Member("A", 90);
        myArrays[1] = new Member("B", 40);
        myArrays[2] = new Member("C", 50);
        myArrays[3] = new Member("D", 60);
        myArrays[4] = new Member("E", 10);
        myArrays[5] = new Member("F", 30);
        myArrays[6] = new Member("G", 70);
        myArrays[7] = new Member("H", 80);
        myArrays[8] = new Member("I", 20);
        myArrays[9] = new Member("J", 1);

      /*  MyArrays.sort(myArrays, new MyComparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Score s1 = (Score) o1;
                Score s2 = (Score) o2;
                return s1.eng - s2.eng;
            }
        });
*/
        for (MyComparable myArray : myArrays) {

        }System.out.println();


    }
}
