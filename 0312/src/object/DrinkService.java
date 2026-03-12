package object;

public class DrinkService {
    public static void main(String[] args) {

    }
    public static void printByTemperature(Drink[] drinks, boolean isCold){
        if(isCold){
            System.out.println("차가운 음료");
        } else{
            System.out.println("뜨거운 음료");
        }

        for(int i=0; i<drinks.length; i++){
            if(drinks[i].isCold == isCold){
                System.out.println(drinks[i].drinkName);
            }
        }
    }

}
