package Quest.method;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("일자를 입력하세요(1~31)");

        int todayDate = sc.nextInt();
        System.out.printf("%d일의 날씨는 %s 입니다", todayDate, weatherTdy(todayDate));


    }
    public static String weatherTdy(int day){
        String[] weather = {"sunny","cloudy","rainy","snowing","windy","hot","warm","humid"};

        if(day > 31 || day <-31 || day==0){ // 너무 크거나 작은 값은 잘못된 입력으로 처리
            System.out.println("잘못된 숫자 접근입니다.");
            return "NOT WEATHER";
        }
//      날짜가 8을 초과하면 날씨 배열을 순환하도록 처리
        if(day >7 || day <0){
            int dayIdx = --day;
            while(dayIdx <0 || dayIdx > 7) {
                if (dayIdx < 0) { // -31일 음수 처리
                    dayIdx += 8;
                }
                if (dayIdx > 7) { // 31일 양수 처리( 날씨 개수(8) < 일자(31)
                    dayIdx -= 8;
                }
            }
//          결과 값 : 0 <=dayIdx <=7
            return weather[dayIdx];

        }
        else{ // 날씨가 1~7일까지 일 경우
            return weather[--day];
        }
    }
}
