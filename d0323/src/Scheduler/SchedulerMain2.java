package Scheduler;

import java.util.ArrayList;
import java.util.Scanner;

public class SchedulerMain2 {

    ArrayList<Day> days;
    Scanner sc;

    public SchedulerMain2() {
        days = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    //등록
    public void register() {
        System.out.println("[등록]");

        System.out.print("일정 이름 입력: ");
        String tempName = sc.nextLine();

        System.out.print("일정 시간 입력: ");
        String tempTime = sc.nextLine();

        Day tempDay = new Day(tempName, tempTime);
        days.add(tempDay);

        System.out.println("등록 완료");
    }


    //조회
    public void findAll() {
        System.out.println("[조회]");

        if (days.isEmpty()) {
            System.out.println("등록된 일정이 없습니다.");
            return;
        }

        for (int i = 0; i < days.size(); i++) {
            System.out.println((i + 1) + ". " + days.get(i));
        }
    }

    //삭제
    public void delete() {
        System.out.println("[삭제]");

        if (days.isEmpty()) {
            System.out.println("삭제할 일정이 없습니다.");
            return;
        }

        findAll();
        System.out.print("삭제할 번호를 선택: ");
        int deleteNum = Integer.parseInt(sc.nextLine());

        if (deleteNum < 1 || deleteNum > days.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        days.remove(deleteNum - 1);
        System.out.println("삭제 완료");
    }

    //변경
    public void update() {
        System.out.println("[변경]");

        if (days.isEmpty()) {
            System.out.println("변경할 일정이 없습니다.");
            return;
        }

        findAll();
        System.out.print("변경할 번호를 선택: ");
        int updateNum = Integer.parseInt(sc.nextLine());

        if (updateNum < 1 || updateNum > days.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        Day updateDay = days.get(updateNum - 1);

        System.out.print("새 일정 이름 입력: ");
        String updateName = sc.nextLine();

        System.out.print("새 일정 시간 입력: ");
        String updateTime = sc.nextLine();

        updateDay.setName(updateName);
        updateDay.setTime(updateTime);

        System.out.println("변경 완료");
    }

    //메뉴반복 -- 시작점

    public void run() {
        while (true) {

            System.out.println("\n1.등록 2.조회 3.변경 4.삭제 5.종료");
            System.out.print("메뉴 선택: ");

            String input = sc.nextLine();

            try {
                int menu = Integer.parseInt(input);

                switch (menu) {
                    case 1 -> register();
                    case 2 -> findAll();
                    case 3 -> update();
                    case 4 -> delete();
                    case 5 -> {
                        System.out.println("종료");
                        return;
                    }
                    default -> System.out.println("메뉴가 존재하지 않습니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력하세요.");
            }
        }

    }

    public static void main(String[] args) {
        SchedulerMain2 scheduler = new SchedulerMain2();
        scheduler.run();

    }
}
