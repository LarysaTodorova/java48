package lesson31.book;

import java.util.Comparator;

public class BookCompareByTitle implements Comparator<Book> {


    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
