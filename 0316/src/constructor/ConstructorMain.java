package constructor;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encapsulation = sc.nextLine();
        String inheritance = sc.nextLine();
        String polymorphism = sc.nextLine();

        Constructor cr = new Constructor(encapsulation, inheritance, polymorphism);


    }
}
