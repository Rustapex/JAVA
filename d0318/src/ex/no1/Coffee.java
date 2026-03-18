package ex.no1;

public class Coffee extends Drink{
    private Boolean hasCaffeine; // de caffeine : false, caffeine : true

    public Coffee(){
        super();
        this.hasCaffeine = true;
    }

    public Coffee(String menuName, int price, String temp, int shotCount, Boolean hasCaffeine){
        super(menuName, price, temp, shotCount);
        this.hasCaffeine = hasCaffeine;
    }

    public void brewCoffee(){
        System.out.println("브루 커피를 마시겠습니까 Y/N");
        String isBrew = sc.nextLine();
        if(isBrew.equals("Y")){
            int newPrice = getPrice() + 2000;
            setPrice(newPrice);
            setTemp("hot");
        } else{
            return;
        }

    }
    // overloading
    public void brewCoffee(String temp){
        System.out.println("아이스 브루 커피를 마시겠습니까 Y/N");
        String isIce = sc.nextLine();
        if(temp.equals("ice")){
            if(isIce.equals("Y")){
                String isBrew = sc.nextLine();
                int newPrice = getPrice() + 2000;
                this.brewCoffee();
                setTemp("cold");
            } else{
                return;
            }
        } else{
            System.out.println("아이스 브루 커피가 아닙니다.");
            return;
        }

    }
    public void deCaffeine(){
        System.out.println("디카페인으로 마시겠습니까? Y/N");
        String isCaffeine = sc.nextLine();
        if(isCaffeine.equals("Y")){
            this.hasCaffeine = false;
        } else {
            System.out.println("카페인을 선택하셨습니다.");
            this.hasCaffeine = true;
        }

    }

    @Override
    public String toString() {
        String caffeine = (hasCaffeine)?"yes" : "no";
        return super.toString() + ", hasCaffeine ; " + caffeine;
    }

}
