package InClass.Operator;

public class Operator1 {
    public static void main(String[] args) {
        /*
        연산자 : 연산을 수행하면 연산의 결과가 반드시 발생한다.
        피연산자 : 연산의 대상이 되는 것

        부호 연산자 : - , +
        증감 연산자 : a++ , ++a ,a--, --a (전위 or 후위)
        사칙 연산자 : + - * / %
        대입 연산자 : a=3
        복합 대입 연산자 : += -= 등
        비교 연산자 : < >= == !=
        논리 연산자 : || &&


        */
        int num1=1, num2 =3;
        System.out.println("num1 + num2 = " + num1 + num2);;

        num1++; --num2;
        System.out.println("사칙연산");
        System.out.println("num1++ * --num2 = " + num1 * num2);
        System.out.println("num1 / (double)num2 = " + num1 / (double)num2);

        int n=0, sum=0;
        while(n<10){
            n++;
            sum +=n;
        }
        System.out.println("1부터 10까지의 합 : " + sum);

        int k=0, sum2=0;
        while(k++<10){
            sum +=n;
        }
        System.out.println("1부터 10까지의 합 : " + sum2);
    }
}
