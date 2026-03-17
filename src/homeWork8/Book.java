package homeWork8;

public class Book {
    private String author;
    private String bookName;
    private int pageCount;
    private int bookID;
    private boolean storage;

    public Book(String author, String bookName, int pageCount, int bookID, boolean storage) {
        this.author = author;
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.bookID = bookID;
        this.storage = storage;
    }

    public Book(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setStorage(boolean storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", pageCount=" + pageCount +
                ", bookID=" + bookID +
                ", storage=" + storage +
                '}';
    }
}


