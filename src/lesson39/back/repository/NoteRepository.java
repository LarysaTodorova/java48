package lesson39.back.repository;

import lesson39.back.entity.Note;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NoteRepository implements InMemoryRepository {

    private List<Note> dataBase;
    private Integer noteId = 0;

    public NoteRepository() {
        this.dataBase = new ArrayList<>();
    }

    @Override
    public Note add(String noteName, String noteDescription) {
        noteId++;
        Note newNote = new Note(noteId, noteName, noteDescription);
        dataBase.add(newNote);
        return newNote;
    }

    @Override
    public List<Note> findAll() {
        return dataBase;
    }

    @Override
    public Optional<Note> findById(Integer id) {
//        for (Note note : dataBase) {
//            if (note.getId().equals(id)) {
//                return Optional.of(note);
//            }
//        }
//        return Optional.empty();

        return dataBase.stream()
                .filter(note -> note.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Note> findByName(String noteName) {
        return dataBase.stream()
                .filter(note -> note.getName().equals(noteName))
                .toList();

    }

    @Override
    public Note updateNote(Note noteForUpdate, String updateNoteDescription) {

        noteForUpdate.setDescription(updateNoteDescription);
        return noteForUpdate;
    }

    @Override
    public Note deleteNote(Note noteForDelete) {

        dataBase.remove(noteForDelete);

        return noteForDelete;
    }
}
