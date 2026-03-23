package Practice.My;

public class MyUtil {

    public void printDescendingStars(int starCnt){
        for (int i = 1; i <= starCnt; i++) {
            for (int j = 1; j <= starCnt; j++) {
                if (j <= starCnt - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public void printStar(int starCnt){
        for(int i=0; i<starCnt; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void executeNTimes(MyCodeRun myCodeRun, int repeatCnt){
        for(int i=0; i<repeatCnt; i++){
            myCodeRun.codeRun();
        }
    }
    public void repeat3Times(Runnable r){
        for(int i=0 ;i<3; i++){
            r.run();
        }
    }
}
