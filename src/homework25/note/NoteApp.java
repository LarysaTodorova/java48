package homework25.note;

import java.util.Arrays;

public class NoteApp {
    public static void main(String[] args) {

        NoteRepository noteRepository = new NoteRepository(10);
        NoteService service = new NoteService(noteRepository);

        service.addNewNote(1, "Phone to my son");
        service.addNewNote(2, "To by oranges");
        service.addNewNote(3, "To by Watter");
        service.addNewNote(4, "Phone to my sister");
        service.addNewNote(5, "To by apples");
        service.addNewNote(6, "To  take package");


        service.findNoteById(5);
        service.findByText("To by oranges");
        System.out.println();
        System.out.println(Arrays.toString(service.findAll()));
        System.out.println(service.findNoteById(3));


    }
}
