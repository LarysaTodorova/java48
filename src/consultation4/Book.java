package consultation4;

public class Book {
    private String name;
    private String description;
    private Author authorInfo;

    public Book(String name, String description, Author authorInfo) {
        this.name = name;
        this.description = description;
        this.authorInfo = authorInfo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", authorInfo=" + authorInfo +
                '}';
    }
}
