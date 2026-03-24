package prac.ex;

public class Ex01 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 10;
        arr[3] = 10; //ArrayIndexOutOfBoundsException 발생 > 프로그램 정상 종료 안돼
        /*unChecked exception*/

        System.out.println("프로그램 정료");
    }
}
