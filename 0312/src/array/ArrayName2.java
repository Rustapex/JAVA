package array;

/*함수로 분리하면 좋은점
*
* 중복코드 제거
* 유지보수가 좋음
* 코드의 집중화가 됨*/


public class ArrayName2 {
    public static void main(String[] args) {
        String[] names = {"elice", "brick", "farmer", "poetry", "hallow"};

        outputNames(names);
    }
    public static void outputNames(String[] names){
        for (String name : names) {
            System.out.println(name);
        }
    }


}
