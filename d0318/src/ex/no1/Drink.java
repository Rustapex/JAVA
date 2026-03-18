package ex.no1;

import java.util.Scanner;

public class Drink {
    protected Scanner sc = new Scanner(System.in);

    private String menuName;
    private int price;
    private String temp;
    private int shotCount;

    // 생성자
    public Drink() {
        this(null, 0, "cold", 0);
    }

    public Drink(String menuName, int price, String temp, int shotCount) {
        this.menuName = menuName;
        this.price = price;
        this.temp = temp;
        this.shotCount = shotCount;
    }

    /*getter*/
    public String getMenuName(){
        return menuName;
    }
    protected int getPrice() {
        return price;
    }


    // setter
    protected void setMenuName(String menuName){
        this.menuName = menuName;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    protected void setTemp(String temp) {
        this.temp = temp;
    }

    public void addShot() {
        System.out.println("샷 추가를 하시곘습니까? Y/N");
        String isShot = sc.nextLine();
        if(isShot.equals("Y")) {
            System.out.println("몇 개의 샷을 추가하시겠습니까?");
            int shotcnt = Integer.parseInt(sc.nextLine());
            shotCount += shotcnt;
            price = this.price + 600 * shotcnt;
        } else{
            return;
        }
    }

    public void inflation() {
        System.out.println("인플레이션으로 가격이 상승합니다.");
        price += 2000;
    }

    @Override
    public String toString() {
        return "menuName : " + menuName + " , price : " + price
                + " , temp : " + temp + " , shotCount : " + shotCount;
    }
}
