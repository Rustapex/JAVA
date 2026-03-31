package given.prac.Async;

// 클래스 안에 클래스 별도로 만들 수 있다.
// method 안에서 class 만들 수 있다. (지역 내부 클래스)

public class Ex01 {
    public static void main(String[] args) {

        for(int i=1; i<= 10; i++){
            System.out.println("a가 춤을 춘다");
        }
        for(int i=1; i<= 10; i++){
            System.out.println("b가 춤을 춘다");
        }
    }
}
