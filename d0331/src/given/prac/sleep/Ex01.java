package given.prac.sleep;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("3초 후 공개");

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("공개합니다.");
    }
}
