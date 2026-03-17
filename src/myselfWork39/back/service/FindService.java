package myselfWork39.back.service;

import myselfWork39.back.dto.Response;
import myselfWork39.back.entity.Note;
import myselfWork39.back.repository.InMemoryRepository;

import java.util.List;
import java.util.Optional;

public class FindService {
    private InMemoryRepository repository;

    public FindService(InMemoryRepository repository) {
        this.repository = repository;
    }

    public Response<List<Note>> findAll() {
        List<Note> allNotes = repository.findAll();
        if (allNotes.isEmpty()) {
            return new Response<>(allNotes, "Database is empty!");
        }else {
            return new Response<>(allNotes, "");
        }
    }

    public Response<Note> findNoteById(Integer id) {
        Optional<Note> foundedNote = repository.findById(id);
        if (foundedNote.isPresent()) {
            return new Response<>(foundedNote.get(), "");
        }else {
            return new Response<>(null, "Note with Id: " + id + " was not found!");
        }
    }

    public Response<List<Note>> findByName (String name) {
        List<Note> foundedNotes = repository.findByName(name);
        if (foundedNotes.isEmpty()) {
            return new Response<>(foundedNotes, "Notes with this name: " + name + " were not found");
        }else {
            return new Response<>(foundedNotes, "");
        }
    }
}
