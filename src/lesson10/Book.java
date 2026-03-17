package lesson10;

import java.util.Objects;

public class Book {
/*
Создайте класс Book в котором хранятся данные о:
- авторе
- названии книги
- количество страниц
- номер в каталоге книг
 */
    private  String author;
    private String name;
    private int page;
    private String idNumber;

    public Book(String author, String name, int page, String idNumber) {
        this.author = author;
        this.name = name;
        this.page = page;
        this.idNumber = idNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return page == book.page && Objects.equals(author, book.author) && Objects.equals(name, book.name) && Objects.equals(idNumber, book.idNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, page, idNumber);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", page=" + page +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
