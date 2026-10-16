import java.util.ArrayList;
import java.util.Scanner;

class Book
{
    int id;
    String name;

    Book(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    void display()
    {
        System.out.println("Book ID: " + id);
        System.out.println("Book Name: " + name);
    }
}

class Library
{
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b)
    {
        books.add(b);
    }

    void displayBooks()
    {
        for(Book b : books)
        {
            b.display();
            System.out.println();
        }
    }
}

class LibraryManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        try
        {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();

            Book b = new Book(id, name);

            library.addBook(b);

            System.out.println("\nBook Added Successfully\n");

            System.out.println("Library Books:");
            library.displayBooks();
        }
        catch(Exception e)
        {
            System.out.println("Invalid input");
        }
    }
}