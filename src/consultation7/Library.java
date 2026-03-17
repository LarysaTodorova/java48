package consultation7;

import java.util.Arrays;

public class Library {

    private BookShelf[] shelves;
    private Author[] authorList = new Author[5];

    public Library(int numberOfShelves) {
        this.shelves = new BookShelf[numberOfShelves];
    }

    public Library(Author[] authorList) {
        this.authorList = authorList;
    }

    public BookShelf[] getShelves() {
        return shelves;
    }

    public Author[] getAuthorList() {
        return authorList;
    }

    @Override
    public String toString() {
        return "Library{" +
                "shelves=" + Arrays.toString(shelves) +
                ", authorList=" + Arrays.toString(authorList) +
                '}';
    }
}
