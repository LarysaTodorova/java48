package lesson10;

import java.util.Objects;

public class Book2Author {
    /*
    Создайте второй вариант, таким образом, чтобы в классе Book у вас данные об авторе и
данные о характеристиках книги (название, страницы) хранились в ОТДЕЛЬНЫХ (РАЗНЫХ) классах
 */

   private String author;

    public Book2Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book2Author that = (Book2Author) o;
        return Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(author);
    }

    @Override
    public String toString() {
        return "Book2Author{" +
                "author='" + author + '\'' +
                '}';
    }
}
