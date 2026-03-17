package lesson31.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookDemo {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("book5", "author3", 1852));
        books.add(new Book("book1", "author1", 1942));
        books.add(new Book("book2", "author4", 1899));
        books.add(new Book("book4", "author5", 1990));
        books.add(new Book("book3", "author6", 2004));
        books.add(new Book("book7", "author2", 1967));

        System.out.println("Изначальный список" + books);

        books.sort(new BookCompareByTitle());
        System.out.println("Сортировка по названию "+ books);

        books.sort(new BookCompareByAuthor());
        System.out.println("Сортировка по автору" + books);

        books.sort(new BookCompareByYear());
        System.out.println("Сортирока по году издания" +books);
    }
}
