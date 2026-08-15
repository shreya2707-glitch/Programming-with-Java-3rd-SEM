// Importing the Book class from the user-defined library package
import library.Book;

public class LibraryDemo {
    public static void main(String[] args) {
        // Create instances of Book
        Book book1 = new Book(101, "Effective Java", "Joshua Bloch", 45.50);
        Book book2 = new Book(102, "Clean Code", "Robert C. Martin", 42.00);

        // Display book details
        book1.displayBookInfo();
        System.out.println(); // Blank line for spacing
        book2.displayBookInfo();
    }
}