package homework25.note;

public class NoteService {

    NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public boolean addNewNote(int id, String newText) {
        Note newNote = noteRepository.findById(id);
        if (newNote != null) {
            return false;
        }
        Note myNote = new Note(id, newText);
        return noteRepository.addNote(myNote);

    }

    public Note findNoteById(int id) {
        return noteRepository.findById(id);
    }

    public Note findByText(String text) {
        return noteRepository.findByText(text);

    }

    public Note[] findAll() {
        return noteRepository.findAll();
    }
}
