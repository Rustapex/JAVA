package Variable;


class Lotto{

    static int[] lotto  = new int[5];
    //static int cnt;  // 기본값 초기화
    static int cnt=5;  //명시적 초기화




    //static 초기화 블럭
    static {

        //
        for( int i=0; i< lotto.length; i++) {
            int random = (int)  ( Math.random()*45) +1 ;  //0~44   +1
            lotto[i] =random;
        }
    }


    public static void printLotto() {
        //System.out.println( lotto);
        for( int i=0 ; i<lotto.length; i++) {
            System.out.print( lotto[i]  +",");
        }
    }


    public static void printCnt() {
        System.out.println( cnt);
    }


    //매서드로 배열의 값을 변경하기
    //호출해야만 실행된다
    public static void init() {

        //
        for( int i=0; i< lotto.length; i++) {
            int random = (int)  ( Math.random()*45) +1 ;  //0~44   +1
            lotto[i] =random;
        }
    }

}


