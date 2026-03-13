package object.ex.coffeMachine;

public class CoffeeMachineOOP {
	int sugar = 1000;
	int creamer = 1000;
	int coffeeBean = 1000;
	int water = 10000;
	int salesAmount = 0;

	public String makeMilkCoffee(int money) {
		if (money == 100) {
			salesAmount += money;

			int waterAmount = 100;
			int beanAmount = 10;
			int sugarAmount = 10;
			int creamerAmount = 10;

			water -= waterAmount;
			coffeeBean -= beanAmount;
			sugar -= sugarAmount;
			creamer -= creamerAmount;

			return "Milk Coffee";
		}
		return "";
	}

	public void printInfo() {
		System.out.println("<< Current Coffee Info >>");
		System.out.println(salesAmount);
		System.out.println(water);
		System.out.println(sugar);
		System.out.println(coffeeBean);
		System.out.println(creamer);
	}

	public void fillCoffee() {
		water += 1000;
		coffeeBean += 100;
		sugar += 100;
		creamer += 100;
	}

	public static void main(String[] args) {
		CoffeeMachineOOP machine = new CoffeeMachineOOP();

		machine.printInfo();
		machine.fillCoffee();
		machine.makeMilkCoffee(100);
	}
}