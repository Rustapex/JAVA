package prac.ex.UnChecked;

public class MyCalculator {
    //예외 상황
    /*음수는 더하기 할 수 없다.
    public int add(int su1, int su2){
        if(su1 <0 || su2 <0){
            return -1; // -1 => 잘못된 계산으로 처리
        }
        int total;
        total = su1+su2;
        return total;
    }

     */
    public int add(int su1, int su2) throws Exception {
        if(su1 <0 || su2 <0){
            //음수 안돼 예외 일으키는 코드 추가하기
            throw new Exception("음수예외 발생"); // 예외 발생(checked Exception)
        }
        int total;
        total = su1+su2;
        return total;
    }
    public int add2(int su1, int su2){
        if(su1 <0 || su2 <0){
            //음수 안돼 예외 일으키는 코드 추가하기
            throw new RuntimeException("음수예외 발생"); // 예외 발생(unchecked Exception)
        }
        int total;
        total = su1+su2;
        return total;
    }
}
