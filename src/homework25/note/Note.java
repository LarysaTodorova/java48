package homework25.note;

public class Note {
    /*
    Запишите приложение для учета заметок (номер заметки и текст заметки) в записной книжке.
    Необходимо добавить новые элементы и выполнить поиск по параметру (id, имя и прочее).
     */

    private int id;
    private String message;

    public Note(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
