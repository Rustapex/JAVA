package object.ex.coffeMachine;

/*자판기
 * 데이터 + 데이터를 사용하는 함수 => 설계, 명세*/
public class CoffeeMachine {
    /*변수가 만들어진 것이 아니다 || new keyword를 통해서 메모리 확보*/
    private int sugar = 1000;
    private int creamer = 1000;
    private int coffeeBean = 1000;
    private int water = 10000;
    private int salesAmount = 0;

    //변수(객체)를 다루는 method 정의

    /*객체 method
    반드시 객체를 생성한 이후부터 사용할 수 있다.
    객체의 정보가 전달된다. this*/

    /*입력*/
    /*public void input(){

    }*/

    /*출력*/
    public void printOut(){
        System.out.println("설탕 : " + this.sugar);
        System.out.println("프리마 : " + this.creamer);
        System.out.println("원두 : " +this.coffeeBean);
        System.out.println("물 : " +this.water);
        System.out.println("매출 : " +this.salesAmount);
    }

    /*밀크 커피 만들기*/
    public String getMilkCoffee(int money){
        this.sugar -= 10;
        this.creamer -= 20;
        this.coffeeBean -= 10;
        this.water -= 100;
        this.salesAmount += money;

        return "Milk COFFEE";
    }

    /*원두 커피 만들기 */

    /*커피 채우기*/
    public void refill(){
        this.sugar += 100;
        this.creamer += 100;
        this.coffeeBean += 100;
        this.water += 100;
    }


}
