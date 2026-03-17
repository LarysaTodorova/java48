package lesson26;

public class Film {
    /*
    написать приложение для хранения данных каталога фильмов

 - добавление нового фильма в каталог

- распечатать каталог фильмов

Реализовать приложение с помощью создания классов, которые:

 1) хранят данные, позволяют добавлять новые элементы, распечатывать информацию

2) запрашивают данные у пользователя и отправляют эти полученные данные для сохранения в каталоге
     */

    private String genre;
    private String title;

    public Film(String genre, String title) {
        this.genre = genre;
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Film{" +
                "genre='" + genre + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
