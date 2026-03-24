package prac.ex;

public class Ex03 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[0] = 10;
            arr[1] = 10;
            arr[2] = 10;
            arr[3] = 10; //ArrayIndexOutOfBoundsException 발생 > 프로그램 정상 종료 안돼
            /*unChecked exception*/
        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
            System.out.println("배열의 길이를 먼어감");
        }
        System.out.println("프로그램 종료");

    }
}
