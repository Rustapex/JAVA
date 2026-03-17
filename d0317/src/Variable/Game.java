package Variable;

public class Game {
    String name;
    int price;
    static int cnt=0;

    public Game(){
        cnt++;
    }
    public Game(String name, int price){
        this.name = name;
        this.price = price;
        cnt++;

    }
    /*instance 변수 초기화 block , 생성자보다 먼저 동작, 생성자에서 공통 작업 코드가 있을 때*/
    {
        cnt++;
    }

    //toString
    public String toString(){
        return "name : " + name + ", price : " + price;
    }

    public static void printCount(){
        System.out.println(cnt);
    }
}
