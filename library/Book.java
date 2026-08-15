package library;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;

    // Constructor to initialize book details
    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Public method to display book information
    public void displayBookInfo() {
        System.out.println("=== Book Information ===");
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : $" + price);
    }
}