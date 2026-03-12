package array;

public class ClassVarStaticVar {
    static int index =0; // class 전역 변수 , 클래스 내 모든 method 에서 접근 가능

    public static void main(String[] args) {



        /*int index =0 index를 메인에서 만들면 계속 전달하고 증가한 값 반환해 사용 가능*/
       /* int index = 0;*/ // 모든 클래스 내에 있는 모든 method가 함께 사용 가능한 클래스 전역변수 => main 위 클래스 안쪽에
        plusNumber();
        plusNumber();
        printNumber();

    }

    private static void plusNumber() {

    }

    private static void printNumber() {

    }

}
