package homework25.note;

public class NoteRepository {
    private Note[] notes;

    public NoteRepository(int sizeOfNote) {
        this.notes = new Note[sizeOfNote];
    }

    public boolean addNote(Note newNote) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                notes[i] = newNote;
                return true;
            }

        }
        return false;
    }

    public Note findById(int id) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != null) {
                if (notes[i].getId() == id) {
                    return notes[i];
                }
            }
        }
        return null;

    }

    public Note findByText(String text) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != null) {
                if (notes[i].getMessage().equalsIgnoreCase(text)) {
                    return notes[i];
                }
            }
        }
        return null;

    }

    public Note[] findAll() {
        return notes;
    }
}
