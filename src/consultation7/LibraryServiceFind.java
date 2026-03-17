package consultation7;

public class LibraryServiceFind {

    public boolean putBookOnShelf(Book book, int numberOfShelf, BookShelf[] shelves) {
        BookShelf targetShelves = shelves[numberOfShelf];
        Book[] books = targetShelves.getBooks();

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }

        }
        return false;
    }

    public Book findBookByTitle(String title, BookShelf[] shelves) {
        for (int i = 0; i < shelves.length; i++) {
            BookShelf currentShelf = shelves[i];
            Book[] books = currentShelf.getBooks();
            for (int j = 0; j < books.length; j++) {
                if (books[i].getTitle().equals(title)) {
                    return books[i];
                }

            }
            
        }
        return null;
    }

    public Book Author(String authorName, BookShelf[] shelves) {
        for (int i = 0; i < shelves.length; i++) {
            BookShelf currentShelf = shelves[i];
            Book[] books = currentShelf.getBooks();
            for (int j = 0; j < books.length; j++) {
                if (books[i].getAuthor().equals(authorName)){
                    return books[i];
                }
                
            }
            
        }
        return null;

    }

}
