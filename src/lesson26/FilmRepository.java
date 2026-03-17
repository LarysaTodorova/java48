package lesson26;

public class FilmRepository {
    Film[] films;

    public FilmRepository(int filmSize) {
        this.films = new Film[filmSize];
    }
    public boolean add(Film newFilm) {
        for (int i = 0; i < films.length; i++) {
            if (films[i] == null) {
                films[i] = newFilm;
                return true;
            }
        }
        return false;
    }
    public void printAll () {
        for (int i = 0; i < films.length; i++) {
            if (films[i] != null) {
                System.out.println("--------------");
            System.out.println("Genre of film: " + films[i].getGenre());
            System.out.println("Title of film: " + films[i].getTitle());
            System.out.println();
        }
    }
}
}
