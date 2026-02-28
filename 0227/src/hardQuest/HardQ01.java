package hardQuest;

public class HardQ01 {
    /*1999년 H시의 인구는 250만명, 연증가율은 3.6%이고 k시의 인구는 180만명이며
연증가율은 4.2%일 때 K시의 인구가H시의 인구보다 많아지게 되는 해를 구하는 */
    static void main(String[] args) {
        double hPop1999 =250.0, kPop1999 = 180.0;
        int year = 1999;

        while(hPop1999 >= kPop1999){
            year++;
            hPop1999 *= 1.036;
            kPop1999 *= 1.042;
        }
        System.out.println("k시의 인구가 H시보다 많아지게 되는 해는 " + year+ "년이다.");

    }

}
