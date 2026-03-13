package object;

public class DrinkInfo {
    public static void main(String[] args) {


        /*drink 타입으로 변수 만들기*/
        /*구조화된 변수 만들기*/
        Drink drink1 = new Drink();
        Drink drink2 = new Drink();
        Drink drink3 = new Drink();

        input(drink1, "초코젤라또 말차라떼",4400,true);
        input(drink2, "라이트 바닐라 아몬드라떼",3900,true);
        input(drink3, "에스프레소 도피오",2000,false);

        print(drink1);

        Drink[] drinks = {drink1, drink2, drink3};

        DrinkService.printByTemperature(drinks, true);
        DrinkService.printByTemperature(drinks, false);
    }
//  입력하기
    public static void input(Drink drink, String drinkName, int price, boolean isCold){
        drink.drinkName = drinkName;
        drink.price = price;
        drink.isCold = isCold;
//        drink.calories = calories;
    }
//  출력하기
    public static void print(Drink drink){
        System.out.println(drink.drinkName);
        System.out.println(drink.price);
        System.out.println(drink.isCold);
//        System.out.println(drink.calories);
    }
}
