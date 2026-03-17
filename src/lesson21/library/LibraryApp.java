package lesson21.library;

public class LibraryApp {
    public static void main(String[] args) {

        LibraryCatalog catalog = new LibraryCatalog();

        Book book = new Book("The Hobbit", "Tolkien", 1933, 500);

        Magazine magazine = new Magazine("National Geografic", "----", 2015, 125);

        catalog.addMediaItem(book);
        catalog.addMediaItem(magazine);

        catalog.printAllItems();



    }
}
