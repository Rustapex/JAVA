package calculator.Interface;

public class SYSCalculator implements Calculator{
    @Override
    public int add(int su1, int su2) {
        System.out.println("손영석의 더하기 기능");
        return su1 + su2;
    }

    @Override
    public int sub(int su1, int su2) {
        System.out.println("손영석의 빼기 기능");
        return su1-su2;
    }
}
