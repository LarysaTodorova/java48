package lesson10;

import consultation4.Author;

import java.util.Objects;

public class Book2Book {
    private String bookName;
    private int bookPage;
    private String bookId;
    private Book2Author authorInfo;

    public Book2Book(String bookName, int bookPage, String bookId, Book2Author authorInfo) {
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.bookId = bookId;
        this.authorInfo = authorInfo;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public String getBookId() {
        return bookId;
    }

    public Book2Author getAuthorInfo() {
        return authorInfo;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book2Book book2Book = (Book2Book) o;
        return bookPage == book2Book.bookPage && Objects.equals(bookName, book2Book.bookName) && Objects.equals(bookId, book2Book.bookId) && Objects.equals(authorInfo, book2Book.authorInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookPage, bookId, authorInfo);
    }

    @Override
    public String toString() {
        return "Book2Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPage=" + bookPage +
                ", bookId='" + bookId + '\'' +
                ", authorInfo=" + authorInfo +
                '}';
    }
}


