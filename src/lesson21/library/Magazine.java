package lesson21.library;

public class Magazine extends MediaItem {
    private int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;

    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Magazine:" + getTitle() + " " + getAuthor() + " " + getYear() + " " + getIssueNumber());


    }
}
