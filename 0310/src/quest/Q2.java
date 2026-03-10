package quest;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*하루 일정 관리하기 일차원 배열*/
        Scanner sc = new Scanner(System.in);


        String[] scheduler = new String[]{"", "", "", "", ""};

        loop:
        while (true) {
            System.out.print("(1.일정 작성, 2.일정 확인, 3. 일정삭제, 4. 종료)메뉴를 입력하세요:");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1 -> {
                    System.out.println("= 일정 작성 =");

                    System.out.print("일정을 입력할 번호(1~5) :");
                    int scheduleNum = Integer.parseInt(sc.nextLine());
                    if(scheduleNum >=1 && scheduleNum <=5){
                        scheduleNum--;
                        if (scheduler[scheduleNum].equals("")) {
                            System.out.println("일정을 입력하세요");
                            scheduler[scheduleNum] = sc.nextLine();
                        } else {
                            System.out.printf("%d번 일정이 다 찼습니다 다른 숫자를 고르세요%n", scheduleNum+1);
                        }
                    } else{
                        System.out.println("잘못된 숫자 입력입니다");
                        break;
                    }



                }
                case 2 -> {
                    System.out.println("= 일정 확인 =");
                    System.out.print("확인할 일정 순번(1~5) :");
                    int schedule = Integer.parseInt(sc.nextLine());
                    if(schedule >=1 && schedule <=5){
                        if(scheduler[schedule-1].equals("") == false) {
                            System.out.println(scheduler[schedule - 1]);
                        } else{
                            System.out.println("아직 작성하지 않은 일정입니다");
                        }
                    } else{
                        System.out.println("잘못된 일정 접근입니다");
                    }

                }
                case 3 -> {
                    System.out.println("= 일정 삭제 =");
                    System.out.print("삭제할 일정 순번 :");
                    int schedule = Integer.parseInt(sc.nextLine());
                    if(schedule >=1 && schedule <=5){
                        if(scheduler[schedule-1].equals("") == false){
                            scheduler[schedule-1] = "";
                            System.out.println("삭제되었습니다");
                        } else{
                            System.out.println("아직 입력되지 않은 일정입니다");
                        }
                    }


                }
                case 4 -> {
                    System.out.println("종료하겠습니다");
                    break loop;
                }
            }
        }


    }
}
