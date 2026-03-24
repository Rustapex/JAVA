package 실기시험손영석.Q7;

public class Book {
    String bookCode;
    String bookTitle;
    String author;

    public Book() {
        this.bookCode = "sample bookCode";
        this.bookTitle = "sample bookTitle";
        this.author = "sample author";
    }

    public Book(String bookCode, String bookTitle, String author) {
        this.bookCode = bookCode;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    @Override
    public String toString() {
        return "bookCode : " + bookCode  +
                ", bookTitle : " + bookTitle +
                ", author : " + author;
    }
}
