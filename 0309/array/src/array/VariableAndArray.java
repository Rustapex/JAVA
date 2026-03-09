package array;

public class VariableAndArray {
    public static void main(String[] args) {

        //변수 vs 배열

        /*
        * 변수 : 개별적 공간, 이름 접근, 반복문 x(입력 또는 출력시)
        * 배열 : 연속적 공간, index 접근, 배열 선언시 크기 알아야(바로 초기화 제외)
        *
        * 문자열*/
        String[] name = {"Isa", "Peter", "Jack", "Wolf", "Bora"};
        /*String[] name = new String[]{"Isa", "Peter", "Jack", "Wolf", "Bora"};
        * String[] name; name = new String[]{"Isa", "Peter", "Jack", "Wolf", "Bora"};*/



/*      String name1 = "1";
        String name2 = "2";
        String name3 = "3";
        String name4 = "4";
        String name5 = "5";*/

        /*배열 출력시 반복문 사용 가능*/
        for(int i=0; i< name.length; i++){
            System.out.println(name[i]);
        }

        /*향상된 for문, forEach 문*/
        for (String s : name) {
            System.out.println(s);

        }


    }
}
