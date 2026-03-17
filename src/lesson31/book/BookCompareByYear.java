package lesson31.book;

import java.util.Comparator;

public class BookCompareByYear implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book2.getYear() - book1.getYear();
    }
}
