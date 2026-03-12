package scheduler;

import java.util.Scanner;

public class Scheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Schedule = new String[5];
        int index = 0;

        loop:
        while (true) {
            System.out.println("1. 등록 2. 조회 3. 종료");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1 -> {
                    System.out.println("일정등록");
                    String temp = sc.nextLine();
                    Schedule[index++] = temp;
                }
                case 2 -> {
                    System.out.println("일정 조회");
                    for (int i = 0; i < index; i++) {
                        System.out.println(Schedule[i]);
                    }
                }
                case 3 -> {
                    break loop;
                }
            }
        }


    }
}
