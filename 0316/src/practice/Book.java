package practice;

public class Book {
    private final String title;
    private final String author;
    private final int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

/*    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }*/

    public String bookInfo(){
        return "title : " + title + ", author : " + author + ", price : " + price;
    }
}
