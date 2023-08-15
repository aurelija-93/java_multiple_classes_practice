public class App {
    public static void main(String[] args) {
        Library myLibrary = new Library(3);

        Book book1 = new Book("1984", "G. Orwell", "Science fiction");
        Book book2 = new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling", "Fantasy");
        Book book3 = new Book("Good Omens", "T. Pratchett & N. Gaiman", "Fantasy");
        Book book4 = new Book("The Handmaid's Tale", "M. Atwood", "Dystopian novel");

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.addBook(book4);

        System.out.println(myLibrary.getBooks());
        System.out.println(myLibrary.totalBooks());

        Borrower aurelija = new Borrower("Aurelija");
        aurelija.borrowBook(myLibrary, book2);

        System.out.println(myLibrary.getBooks());
        System.out.println(myLibrary.totalBooks());
        System.out.println(aurelija.getBooks());
    }
}
