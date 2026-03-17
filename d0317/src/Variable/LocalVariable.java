package Variable;

public class LocalVariable {
    static void main(String[] args) {
        int a;
        System.out.println(add(5, 3));
    }

    /*add에서 만든 지역 변수는 add가 호출 될 때에 만들어졌다가 return 시에 모두 정리됨*/
    public static int add(int num1, int num2){
        int total;
        total = num1 + num2;

        return total;
    }



}
