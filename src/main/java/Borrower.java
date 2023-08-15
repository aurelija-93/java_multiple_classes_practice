import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> books;

    public Borrower(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void borrowBook(Library library, Book book) {
        Book borrowedBook = library.removeBook(book);
        books.add(borrowedBook);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
