package Class1;

import java.util.Scanner;

public class Q2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        System.out.print(strLength(inputStr));;
        sc.close();
    }
    public static int strLength(String str1){
        return str1.length();
    }
}
