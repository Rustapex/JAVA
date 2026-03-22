package Test1.Q10;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> rollBook = new ArrayList<>();

        int longCnt = 0;
        String firstDic;

        for(int i=0; i<5; i++){
            rollBook.add(sc.nextLine());

            if(rollBook.get(i).length() >=3){
                longCnt++;
            }
        }

        firstDic = rollBook.get(0);
        for(int i=0; i<rollBook.size(); i++){
            if(firstDic.compareTo(rollBook.get(i)) >0){
                firstDic = rollBook.get(i);
            }
        }

        System.out.printf("이름 중 길이가 3 이상의 이름의 개수 : %d%n", longCnt);
        System.out.printf("사전순 가장 앞서는 문자열 : %s%n", firstDic);

    }
}
