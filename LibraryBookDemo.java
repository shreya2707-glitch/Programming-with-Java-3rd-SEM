class Book {

    final String isbn;
    String title;
    String author;
    double price;

    Book(String isbn, String title, String author, double price) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {

        System.out.println("ISBN : " + isbn);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}

public class LibraryBookDemo {

    public static void main(String[] args) {

        Book b = new Book("9789356061234", "Java Programming", "James Gosling", 650);

        b.display();

        // b.isbn = "12345"; // Error: Cannot assign a value to final variable
    }
}