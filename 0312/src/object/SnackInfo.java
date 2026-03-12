package object;

public class SnackInfo {
    public static void main(String[] args) {
        // int a;

        /*배열, 객체 변수를 만들 때(메모리를 사용할 때)
        * new 를 사용하여 변수를 만들 수 있다.*/
        Snack snack = new Snack(); // 구조화된 변수 만들기

        input(snack); /*call by reference*/

    }
    public static void input(Snack snack){
        // 값 넣기
        snack.name = "맛동산";
        snack.company = "해태";
        snack.calories = 510;
        snack.gram = 200;
    }
    public static void printInput (Snack snack){
        System.out.println(snack.name);
        System.out.println(snack.company);
        System.out.println(snack.calories);
        System.out.println(snack.gram);
    }
}
