package lesson31.book;

import java.util.Comparator;

public class BookCompareByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
