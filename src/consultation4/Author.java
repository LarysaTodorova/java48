package consultation4;

public class Author {
    private String name;
    private String description;

    public Author(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
