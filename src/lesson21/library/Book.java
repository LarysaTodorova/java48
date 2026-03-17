package lesson21.library;

public class Book extends MediaItem {

    private int pageCount;

    public Book(String title, String author, int year,int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public void printInfo() {
        System.out.println("Book: " + getTitle() + " " + getAuthor() + " " + getYear() + " " + getPageCount());
    }
}
