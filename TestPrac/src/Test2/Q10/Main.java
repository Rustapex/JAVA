package Test2.Q10;

public class Main {
    public static void main(String[] args) {
        Member[] members = new Member[10];

        MyArrays myArrays1 = new MyArrays();



        members[0] = new Member("A", 90);
        members[1] = new Member("B", 40);
        members[2] = new Member("C", 50);
        members[3] = new Member("D", 60);
        members[4] = new Member("E", 10);
        members[5] = new Member("F", 30);
        members[6] = new Member("G", 70);
        members[7] = new Member("H", 80);
        members[8] = new Member("I", 20);
        members[9] = new Member("J", 1);

        /*
        MyArrays.sort(myArrays, new MyComparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Score s1 = (Score) o1;
                Score s2 = (Score) o2;
                return s1.eng - s2.eng;
            }
        });
        */


        System.out.println("정렬 전");
        for(int i=0;i<members.length; i++){
            System.out.println(members[i].toString());
        }
        myArrays1.sort(members);

        /*for (int i = 0; i < myArrays.length; i++) {
            for (int j = i + 1; j < myArrays.length; j++) {

                Member member1 = (Member) myArrays[i];
                Member member2 = (Member) myArrays[j];
                mem
                if(member1.compareTo(member2) >0){
                    Member mTemp = myArrays[i];
                    myArrays[i] = myArrays[j];
                    myArrays[j] = mTemp;
                }
            }
        }*/
        System.out.println("정렬 후");
        for(int i=0;i<members.length; i++){
            System.out.println(members[i].toString());
        }
    }
}
