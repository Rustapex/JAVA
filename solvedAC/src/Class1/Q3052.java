package Class1;

import java.util.Scanner;

public class Q3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputNumber = new int[10];
        for(int i=0; i<inputNumber.length; i++){
            inputNumber[i] = Integer.parseInt(sc.nextLine());
        }
        int[] remainerSet = getRemainder(inputNumber);
        int count = countDistinctRemainders(remainerSet);
        System.out.println(count);


    }
    public static int[] getRemainder(int[] inputNumber){
        int[] remainderSet = new int[inputNumber.length];
        for(int i=0; i< inputNumber.length; i++){
            remainderSet[i] = (inputNumber[i]%42);
        }
        return remainderSet;
    }
   /* public static int countDistinctRemainders(int[] remainderSet){
        int count =0;

    }*/
}
