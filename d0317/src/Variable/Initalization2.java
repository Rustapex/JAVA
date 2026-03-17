package Variable;

import Variable.Lotto;

public class Initalization2 {

    public static void main(String[] args) {

        //Lotto.init();
        Lotto.printLotto();
        //Lotto.printCnt();




		   /*클스변수초기화 방법과 순서
		   1.기본값으로 초기화
		   2.명시적 초기화
		   3.스태틱 초기화 블럭 : 복잡한 초기화
		     static {

		     }

		 * */




        //프로그램의 시작 순서   main에서 시작함
        // static정보가 먼저 로드됨
        // static 초기화블럭이 실행됨
        // static main을 실행시킴

    }

}
