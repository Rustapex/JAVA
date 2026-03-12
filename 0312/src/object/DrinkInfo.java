package object;

public class DrinkInfo {
    public static void main(String[] args) {

        Drink drink1 = new Drink();
        Drink drink2 = new Drink();
        Drink drink3 = new Drink();

        input(drink1, "초코젤라또 말차라떼",4400,true);
        input(drink2, "라이트 바닐라 아몬드라떼",3900,true);
        input(drink3, "에스프레소 도피오",2000,false);

        Drink[] drinks = {drink1, drink2, drink3};

        DrinkService.printByTemperature(drinks, true);
        DrinkService.printByTemperature(drinks, false);
    }
    public static void input(Drink drink, String drinkName, int price, boolean isCode){
        drink.drinkName = drinkName;
        drink.price = price;
        drink.isCold = isCode;
    }
}
