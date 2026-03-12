package scheduler;

import java.util.Scanner;

public class SchedulerMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] schedule = new String[5];
        int index = 0;

        loop:
        while (true) {
            System.out.println("1. 등록 2. 조회 3. 종료");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1 -> index = register(schedule, index, sc);
                case 2 -> printSchedule(schedule, index);
                case 3 -> {
                    break loop;
                }
                default -> System.out.println("잘못된 메뉴입니다.");
            }
        }

        sc.close();
    }

    public static int register(String[] schedule, int index, Scanner sc) {
        if (index >= schedule.length) {
            System.out.println("더 이상 일정을 등록할 수 없습니다.");
            return index;
        }

        System.out.println("일정 등록");
        String temp = sc.nextLine();
        schedule[index] = temp;
        return index + 1;
    }

    public static void printSchedule(String[] schedule, int index) {
        System.out.println("일정 조회");

        if (index == 0) {
            System.out.println("등록된 일정이 없습니다.");
            return;
        }

        for (int i = 0; i < index; i++) {
            System.out.println((i + 1) + ". " + schedule[i]);
        }
    }
}