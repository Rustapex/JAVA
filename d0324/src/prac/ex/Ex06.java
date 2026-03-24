package prac.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        loop : while(true){
            int su=0;
            try{
                System.out.print("숫자 입력");
                int input = Integer.parseInt(sc.nextLine());
                break;

            }catch (InputMismatchException e){
                System.out.println("숫자로 입력하세요.");
                System.out.println(e.getMessage());

            } catch(Exception e2){
                System.out.println(e2.getMessage());
            }
        }
    }
}
