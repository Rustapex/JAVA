package packageDef;

import java.util.Scanner;

public class StudentManager {

    private Student[] students = new Student[40];
    private Scanner sc = new Scanner(System.in);
    public int index = 0;

    //등록하기
    private void studentSignUp() {
        System.out.println("등록");
        System.out.println("이름, 국어 ,영어 입력하세요");
        String tempName = sc.nextLine();
        int tempKor = Integer.parseInt(sc.nextLine());
        int tempEng = Integer.parseInt(sc.nextLine());

        Student student1 = new Student(tempName, tempKor, tempEng);
        students[index++] = student1;
        System.out.println("등록이 끝났습니다.");
    }

    //조회하기
    private void studentRetrieve() {
        System.out.println("조회");
        System.out.println("조회할 항목을 선택하세요");
        System.out.println("1.전체 조회 2.항목 조회 3. 취소");
        int retrieveMenu = Integer.parseInt(sc.nextLine());
        switch (retrieveMenu){
            case 1->{
                System.out.println("전체 조회입니다.");
                for (int i = 0; i < index; i++) {
                    System.out.printf("%d. %s%n",(i+1), students[i].toString());
                }
                System.out.println("조회가 끝났습니다.");
            }
            case 2->{
                System.out.println("항목 조회입니다.");
                System.out.println("조회할 항목을 입력하세요.");
                System.out.println("이름 / 평균 / 학점 ");
                String inputSet = sc.nextLine();
                if(inputSet.equals("이름")){
                    for(int i=0; i<index; i++){
                        System.out.printf("%d번. %s%n",(i+1), students[i].getName());
                    }
                }
                if(inputSet.equals("평균")){
                    for(int i=0; i<index; i++){
                        System.out.printf("%d번. %.1f%n",(i+1), students[i].getAvg());
                    }
                }
                if(inputSet.equals("학점")){
                    for(int i=0; i<index; i++){
                        System.out.printf("%d번. %c%n",(i+1), students[i].getGrade());
                    }
                }
                else{
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("조회를 종료합니다.");
                    return;
                }

            }
            case 3->{
                System.out.println("취소하겠습니다.");
                return;
            }
            default -> {
                System.out.println("올바른 조회 항목을 선택해주세요");
            }
        }
    }

    //변경하기
    private void studentUpdate(){
        studentRetrieve();
        System.out.println("변경할 학생 번호 입력");
        int updateIndex = Integer.parseInt(sc.nextLine());
        updateIndex--;

        System.out.print("변경할 항목을 입력하세요:(국어/영어/이름)");
        String updateSet = sc.nextLine();
        if(updateSet.equals("국어")){
            System.out.print("변경할 국어 성적을 입력하세요");
            int newKor = Integer.parseInt(sc.nextLine());
            students[updateIndex].setKor(newKor);
            System.out.println("국어성적이 변경이 완료되었습니다.");
        }
        if(updateSet.equals("영어")){
            System.out.print("변경할 영어 성적을 입력하세요");
            int newEng = Integer.parseInt(sc.nextLine());
            students[updateIndex].setEng(newEng);
            System.out.println("영어성적이 변경이 완료되었습니다.");
        }
        if(updateSet.equals("이름")){
            System.out.print("변경할 이름을 입력하세요");
            String newName = sc.nextLine();
            students[updateIndex].setName(newName);
            System.out.println("이름이 변경이 완료되었습니다.");
        }
        else{
            System.out.println("잘못된 입력입니다.");
            System.out.println("변경을 종료합니다.");
            return;
        }
    }

    //삭제하기
    private void studentRemove(){

    }


    //실행
    private void run() {
        int menu;
        loop:
        while (true) {
            System.out.println("1.등록 2.조회 3.변경 4.삭제 5.종료");
            menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1 -> studentSignUp();
                case 2 -> studentRetrieve();
                case 3 -> studentUpdate();
                case 4 -> {
                    System.out.println("삭제");
                    /*studentRemove();*/
                }
                case 5 -> {
                    System.out.println("종료");
                    break loop;
                }
                default -> {
                    System.out.println("메뉴가 업습니다.");
                }
            }
        }
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.run();
    }
}

