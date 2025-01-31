import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

class BookCollection {
    private List<Book> books;

    // Constructor
    public BookCollection() {
        books = new ArrayList<>();
    }

    // Add a book to the collection
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Remove a book from the collection by ISBN
    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    // Display all books in the collection
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : books) {
                book.displayBook();
                System.out.println("-----");
            }
        }
    }
}

public class BookStore {
    public static void main(String[] args) {
        // Create book collection
        BookCollection collection = new BookCollection();

        // Create books
        Book book1 = new Book("1984", "George Orwell", "978-0451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");

        // Add books to the collection
        collection.addBook(book1);
        collection.addBook(book2);
        collection.addBook(book3);

        // Display all books
        collection.displayBooks();

        // Remove a book
        collection.removeBook("978-0061120084");

        // Display books after removal
        collection.displayBooks();
    }
}
