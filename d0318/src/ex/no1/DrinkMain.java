package ex.no1;

public class DrinkMain {
    public static void main(String[] args) {

        // 1. 상속 관계 객체 생성
        Drink drink1 = new Drink("water", 1000, "cold", 0);
        Coffee coffee1 = new Coffee("Americano", 3000, "hot", 2, true);
        Tea tea1 = new Tea("GreenTea", 2500, "hot", 0, "green", 4);

        System.out.println("1. 기본 객체 생성");
        System.out.println(drink1.toString());
        System.out.println(coffee1.toString());
        System.out.println(tea1.toString());

        // 2. 여러 자식을 부모형 배열로 다루기 (다형성)
        Drink[] drinkArray = new Drink[3];
        drinkArray[0] = new Drink("Water", 1000, "cold", 0);           // 일반 부모 객체
        drinkArray[1] = new Coffee("Latte", 4000, "hot", 2, true);     // 업캐스팅
        drinkArray[2] = new Tea("BlackTea", 2800, "hot", 0, "black", 5); // 업캐스팅

        System.out.println("2. 부모형 배열로 다형성");
        for (int i = 0; i < drinkArray.length; i++) {
            System.out.println(drinkArray[i].toString());
        }


        // 3. 업캐스팅 / 다운캐스팅 예시
        System.out.println();
        System.out.println("3. 업캐스팅 / 다운캐스팅");

        Drink up1 = new Coffee("Mocha", 4500, "hot", 2, true); // 업캐스팅
        System.out.println("업캐스팅 후 출력: " + up1.toString());

        if (up1 instanceof Coffee) {
            Coffee down1 = (Coffee) up1; // 다운캐스팅
            down1.brewCoffee();
            System.out.println("다운캐스팅 후 Coffee 기능 사용: " + down1.toString());
        }

        Drink up2 = new Tea("HerbalTea", 3200, "hot", 0, "herbal", 6); // 업캐스팅
        System.out.println("업캐스팅 후 출력: " + up2.toString());

        if (up2 instanceof Tea) {
            Tea down2 = (Tea) up2; // 다운캐스팅
            down2.steepTea();
            System.out.println("다운캐스팅 후 Tea 기능 사용: " + down2.toString());
        }

        // 4. 올바르지 않은 다운캐스팅 예제
        System.out.println();
        System.out.println("4. 잘못된 다운캐스팅 예제");
        Drink wrong = new Drink("BasicDrink", 1500, "cold", 0);


//      Coffee wrongCoffee = (Coffee) wrong;  잘못된 다운캐스팅
        System.out.println("ClassCastException 발생: Drink 객체를 Coffee로 다운캐스팅할 수 없음");


        // instanceof로 막는 안전한 방법
        System.out.println("안전한 다운캐스팅 검사");
        if (wrong instanceof Coffee) {
            Coffee safeCoffee = (Coffee) wrong;
            System.out.println(safeCoffee);
        } else {
            System.out.println("wrong 객체는 Coffee가 아니므로 다운캐스팅하지 않음");
        }


        System.out.println("////////////////////");
        System.out.println();
        System.out.println();
        System.out.println("메서드 사용 예시");


        System.out.println(drinkArray[0].toString());
        drinkArray[0].inflation();
        System.out.println(drinkArray[0].toString());

        System.out.println();
        System.out.println("/////////////////////");

        drinkArray[1].addShot();
        System.out.println(drinkArray[1].toString());
        Coffee coffee2 = (Coffee) drinkArray[1];
        coffee2.brewCoffee();
        coffee2.deCaffeine();
        System.out.println(coffee2.toString());

        System.out.println();
        System.out.println("//////////////////////////");

        Tea tea2 = (Tea) drinkArray[2];
        System.out.println(tea2.toString());
        tea2.steepTea();
        System.out.println(tea2.toString());


    }
}
