package OperatorQ;
import java.util.*;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("menu를 입력하세요 (1등록, 2조회, 3변경, 4삭제");
        int menu = Integer.parseInt(sc.nextLine());

        String result = "";


        switch (menu){
            case 1 ->{
                result ="등록";
            }
            case 2 ->{
                result ="조회";
            }
            case 3 ->{
                result ="변경";
            }
            case 4 ->{
                result ="삭제";
            }
            default -> result ="다시 입력";
        }
        System.out.println(result);

        sc.close();
    }
}
