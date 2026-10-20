package array;

public class Book {
    private String bookTitle;
    private String author;

    public Book (String bookTitle, String author){
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public Book () {}

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showInfo() {
        System.out.println("책 제목: " + bookTitle + ", 저자: " + author);
    }
}
