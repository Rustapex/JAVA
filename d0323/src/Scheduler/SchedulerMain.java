package Scheduler;

import java.util.ArrayList;
import java.util.Scanner;

public class SchedulerMain {
    public static void main(String[] args) {
        ArrayList<Day> days = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("1.등록 2.조회 3.변경 4.삭제 5.종료");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1 -> {
                    System.out.println("등록");
                    System.out.print("일정 이름, 일정 시간 입력 : ");
                    String tempName = sc.nextLine();
                    String tempTime = sc.nextLine();

                    Day tempDay = new Day(tempName, tempTime);
                    days.add(tempDay);
                }
                case 2 -> {
                    System.out.println("조회");
                    for (int i = 0; i < days.size(); i++) {
                        System.out.println(days.get(i));
                    }
                }
                case 3 -> {
                    System.out.println("조회");
                    for (int i = 0; i < days.size(); i++) {
                        System.out.println((i + 1) + ". " + days.get(i));
                    }
                    System.out.println("변경");
                    System.out.print("변경할 번호를 선택");
                    int updateNum = Integer.parseInt(sc.nextLine());

                    System.out.println("변경할 일정 등록");
                    System.out.print("일정이름 , 일정시간 입력");
                    String updateName = sc.nextLine();
                    String updateTime = sc.nextLine();

                    Day updateDay = days.get(--updateNum);
                    updateDay.setName(updateName);
                    updateDay.setTime(updateTime);

                    System.out.println("변경완료");

                }
                case 4 -> {
                    System.out.println("조회");
                    for (int i = 0; i < days.size(); i++) {
                        System.out.println((i + 1) + ". " + days.get(i));
                    }
                    System.out.println("삭제");
                    System.out.print("삭제할 번호를 선택");
                    int deleteNum = Integer.parseInt(sc.nextLine());

                    days.remove(--deleteNum);
                    System.out.println("삭제완료");

                }
                case 5 -> {
                    System.out.println("종료");
                    break loop;
                }
                default -> System.out.println("메뉴가 존재하지 않습니다");
            }

        }
    }
}
