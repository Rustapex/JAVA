package Class1;

import java.util.Scanner;

public class Q5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] students = new int[28];
        int[] stuAttend = new int[30];

        for(int i=0; i<students.length; i++){
            students[i] = sc.nextInt();
            int stuNum = students[i];
            stuAttend[stuNum-1] = stuNum;
        }
        for(int i=0; i<stuAttend.length; i++){
            if(stuAttend[i] ==0){
                System.out.println(i+1);
            }
        }


    }
}
