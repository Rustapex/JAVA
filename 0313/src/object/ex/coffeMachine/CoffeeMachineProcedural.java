package object.ex.coffeMachine;

class CoffeeData {
	int sugar = 1000;
	int creamer = 1000;
	int coffeeBean = 1000;
	int water = 10000;
	int salesAmount = 0;
}

public class CoffeeMachineProcedural {

	public static void printInfo(CoffeeData coffee) {
		System.out.println("<< Current Coffee Info >>");
		System.out.println(coffee.salesAmount);
		System.out.println(coffee.water);
		System.out.println(coffee.sugar);
		System.out.println(coffee.coffeeBean);
		System.out.println(coffee.creamer);
	}

	public static void fillCoffee(CoffeeData coffee) {
		coffee.water += 1000;
		coffee.coffeeBean += 100;
		coffee.sugar += 100;
		coffee.creamer += 100;
	}

	public static String makeMilkCoffee(CoffeeData coffee, int money) {
		if (money == 100) {
			System.out.println("Making milk coffee");

			int waterAmount = 100;
			int beanAmount = 10;
			int sugarAmount = 10;
			int creamerAmount = 10;

			coffee.water -= waterAmount;
			coffee.coffeeBean -= beanAmount;
			coffee.sugar -= sugarAmount;
			coffee.creamer -= creamerAmount;
			coffee.salesAmount += money;

			return "Here is your milk coffee";
		}
		return "";
	}

	public static void main(String[] args) {
		CoffeeData coffee = new CoffeeData();

		printInfo(coffee);
		fillCoffee(coffee);
		makeMilkCoffee(coffee, 100);
	}
}