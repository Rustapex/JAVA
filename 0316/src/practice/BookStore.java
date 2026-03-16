package practice;

import java.util.Scanner;

public class BookStore {
    private Book[] books = new Book[100];
    private int bookCount = 0;

    public void inputAddBook(String title, String author, int price) {
        books[bookCount++] = new Book(title, author, price);
    }

    public void printAllBooks(){
        System.out.println("책 정보 조회");
        if(bookCount ==0){
            System.out.println("등록된 책이 없습니다.");
            return;
        }
        for(int i=0; i<bookCount; i++){
            System.out.printf("%d. %s%n", (i+1), books[i].bookInfo());
        }
    }

    public int getBookCount(){
        return bookCount;
    }


}
