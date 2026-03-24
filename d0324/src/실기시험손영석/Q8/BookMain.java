package 실기시험손영석.Q8;

public class BookMain {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("code0", "title0", "author0");
        books[1] = new Book("code1", "title1", "author1");
        books[2] = new Book("code2", "title2", "author2");

        for(int i=0; i< books.length; i++){
            System.out.println(books[i]);
        }
    }
}
