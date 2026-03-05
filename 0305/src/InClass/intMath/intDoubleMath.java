package InClass.intMath;

public class intDoubleMath {
    public static void main(String[] args) {

        /*
        정수 끼리의 연산 -> 정수 반환
        정수(실수 자동형변환) + 실수 -> 실수 연산
        * */

        int result1 = 10 / 3; //3 int라서 소숫점 버림
        System.out.println(result1);

        double result2 = result1 / 3.0;
        System.out.println(result2);

        double result3;
        result3 = result1 / result2; // int / double = double
        
        /* 형변환 : 일시적으로 자료형(type)을 변환한다.
        *
        * 명시적(강제) 형변환 : 큰 -> 작은 자료형으로 변환
        * 자동 형변환 : 작은 -> 큰 자료형으로 변환*/
        
        double result4 = 45.0;
        int result5=0;
        
        result5 = (int)result4 + result1;
        System.out.println("result5 = " + result5);
        
        

        

    }
}
