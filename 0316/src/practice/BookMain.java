package practice;

import java.util.Scanner;


public class BookMain {

    private Scanner sc = new Scanner(System.in);
    private BookStore bookStore = new BookStore();

    /*private Scanner sc;
    private BookStore bookStore;

    생성자를 통한 초기화도 가능

    public BookMain() {
        sc = new Scanner(System.in);
        bookStore = new BookStore();
    }*/



    //final  =>상수  , 반드시 초기화  해야한다 !!
    // 직접초기화
    // 생성자로 초기화

    /*
    public BookMain( ) {
        this.sc = sc;
        this.bookStore = bookStore;
    }

    */


    public static void main(String[] args) {
        new BookMain().run();
        /*Scanner sc = new Scanner(System.in);

        System.out.print("입력할 책 권수를 출력하세요:");
        int bookCount = Integer.parseInt(sc.nextLine());
        Book[] books = new Book[bookCount];

        for (int i = 0; i < bookCount; i++) {

            int inputPrice = Integer.parseInt(sc.nextLine());

            books[i] = new Book(inputTitle, inputAuthor, inputPrice);
        }*/

    }

    private void run() {
        loop:
        while (true) {
            int menu = inputMenu();

            switch (menu) {
                case 1 ->addBookProcess();
                case 2 -> bookStore.printAllBooks();
                case 3 -> {
                    System.out.println("프로그램 종료");
                    break loop;
                }
                default -> System.out.println("잘못된 메뉴입력입니다.");
            }
        }

    }

    private int inputMenu() {
        System.out.println("1. 추가 / 2. 조회 / 3. 종료");
        return Integer.parseInt(sc.nextLine());
    }

    private void addBookProcess() {
        boolean isValid = false; //
        int inputBookCount=0;
        int bookCount = bookStore.getBookCount();

        while (!isValid) {
            System.out.print("입력할 책 개수 :");
            inputBookCount = Integer.parseInt(sc.nextLine());
            if (inputBookCount >= 1) {
                if (inputBookCount + bookCount > 100) {
                    System.out.println("저장공간이 가득 차서 더 이상 추가할 수 없습니다.");
                    System.out.printf("0보다 크고 %d과 같거나 작은 숫자를 입력하세요.%n", 100 - inputBookCount);
                } else {
                    System.out.printf("%d개 책 추가를 하겠습니다.", inputBookCount);
                    isValid = true;
                }

            } else {
                System.out.println("1 미만의 값을 입력하였습니다.");
                System.out.printf("1이상 %d 이하의 정상 범위 내의 숫자를 입력하세요.", 120 - inputBookCount);
            }
        }
        for (int i = 0; i < inputBookCount; i++) {
            addBooks();
        }
    }

    private void addBooks() {
        System.out.print("책 제목 : ");
        String title = sc.nextLine();
        System.out.print("저자 : ");
        String author = sc.nextLine();
        System.out.print("가격 : ");
        int price = Integer.parseInt(sc.nextLine());
        bookStore.inputAddBook(title, author, price);
    }
}
