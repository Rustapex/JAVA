package loop;
import java.util.Scanner;

public class Break01 {
    // 반복문에서 break 사용되면 반복문 벗어남
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;

        while(true){
            System.out.print("이름을 입력하세요(stop을 입력하면 종료)");
            name = sc.nextLine();
            if(name.equals("stop")) {break;}


        }
        for(;;){
            System.out.print("나이를 입력하세요(-1을 입력하면 종료)");
            age = Integer.parseInt(sc.nextLine());
            if(age == -1) {break;}

        }

        sc.close();

    }

}
