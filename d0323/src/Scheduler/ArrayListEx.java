package Scheduler;


import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        //일정을 저장할 수 있는 변수를 입력
        Day day1 = new Day("JavaStudy", "21시");

        //toString 자동
        System.out.println(day1);

        //일정 변경
        day1.setName("Java Interface Study");
        day1.setTime("23시");

        System.out.println(day1);

        //일정 여러 개
        /*순서, 중복 허용
        * 가변길이 배열처럼 사용하면 돼
        * add, get(index),  remove(index),remove(obj), clear*/
        ArrayList<Day> days = new ArrayList<>();

        // 등록
        Day day01 = new Day("myArrays 연습", "오후 8시");
        days.add(day01);

        Day day02 = new Day("ArrayList 연습", "오후 9시");
        days.add(day02);

        for (int i = 0; i < days.size(); i++) {
            Day item = days.get(i);
            System.out.println(item);
        }

        Day updateDay = days.get(1);
        updateDay.setName("헬스장");
        updateDay.setTime("20시");

        for (int i = 0; i < days.size(); i++) {
            Day item = days.get(i);
            System.out.println(item);
        }

        days.remove(1);

        for (int i = 0; i < days.size(); i++) {
            Day item = days.get(i);
            System.out.println(item);
        }




    }
}
