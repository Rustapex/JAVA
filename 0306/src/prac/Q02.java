package prac;
/*
* 1+(1+2) + (1+2+3) + ... + (1+2+3+4+...+100)
* */

public class Q02 {
    public static void main(String[] args) {
        /*
        aN : n번째 항, aN1 : n-1번째 항, sN : n번째 까지의 합(누적합),
        i : n-1번째 항에서 더할 값 ,
        */
        int i=1, aN1=0, aN;
        int sN = 0;
        /*
        <합 구하는 방식>
        n번째 항 = n-1번쨰 항 + i

        1 +             (1+2) +     (1+2+3)
        1번쟤            2           3
        1               1 + 2(i)    1+2 + 3(i)
        a1(a0 + 1(i))   a1 + i      a2 + i

        합 구하기
        a1 + a1 + 2(i) + a2 + 3(i) ... + 100까지

        한번 구할 때마다 누적합에 현재 구한 항 더하기
        sN = sN + aN

        한번 구할 때마다 현재 구한 항을 이전항으로 바꾸기
        aN1 = aN

        i = i+1
        i 1씩 증가하니까 1씩 더해주기

        * */

        while(i <=100){
            aN = aN1 + i;
            sN = sN + aN;
            aN1 = aN;
            i = i+1;

        }
        System.out.println(sN);

        /* 답 : 171700 */



    }

}
