package lesson26;

public class FilmDemo {
    public static void main(String[] args) {

        UserData userData = new UserData();
        int filmSize = userData.enterFilmSize();

        FilmRepository repository = new FilmRepository(filmSize);

        ServiceFilm serviceFilm = new ServiceFilm(userData, repository);


        serviceFilm.addNewFilm("Comedy","Euro tour");
        serviceFilm.addNewFilm("Drama","Autumn legends");
        serviceFilm.addNewFilm("Fantasy","Harry Potter");


        serviceFilm.printAll();
        serviceFilm.createNewFilm();

    }
}
