package lesson26;

public class ServiceFilm {
    UserData user;
    FilmRepository repository;

    public ServiceFilm(UserData user, FilmRepository repository) {
        this.user = user;
        this.repository = repository;
    }

    public boolean addNewFilm(String genre, String title) {
        if (title.isBlank()) {
            return false;
        }

        Film film = new Film(genre,title);
        return repository.add(film);
    }


    public void printAll() {
        repository.printAll();
    }
    public void  createNewFilm() {
        user.createFilm();
    }
}
