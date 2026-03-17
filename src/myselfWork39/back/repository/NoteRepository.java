package myselfWork39.back.repository;

import myselfWork39.back.dto.Request;
import myselfWork39.back.entity.Note;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class NoteRepository implements InMemoryRepository{

   private List<Note> dataBase;
   private Integer noteId = 0;

    public NoteRepository() {
        this.dataBase = new ArrayList<>();
    }

    @Override
    public Note add(Request request) {
        noteId++;
        Date currentDate = new Date();
        Note newNote = new Note(noteId, request.getName(), request.getDescription(), currentDate);
        dataBase.add(newNote);
        return newNote;
    }

    @Override
    public List<Note> findAll() {
        return dataBase;
    }

    @Override
    public Optional<Note> findById(Integer id) {
        return dataBase.stream()
                .filter(note -> note.getID() == (id))
                .findFirst();
    }

    @Override
    public List<Note> findByName(String name) {
        return dataBase.stream()
                .filter(note -> note.getName().equals(name))
                .toList();
    }

    @Override
    public Note update(Note noteForUpdate, String description) {
        noteForUpdate.setDescription(description);
        return noteForUpdate;
    }

    @Override
    public Note delete(Note noteForDelete) {
        dataBase.remove(noteForDelete);
        return noteForDelete;
    }
}
