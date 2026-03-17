package consultation7;

import java.util.Arrays;

public class BookShelf {

    private Integer idShelf;
    private Book[] books;

    public BookShelf(Integer idShelf, int numberBooksOnShelf) {
        this.idShelf = idShelf;
        this.books = new Book[numberBooksOnShelf];
    }

    public Integer getIdShelf() {
        return idShelf;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "idShelf=" + idShelf +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
