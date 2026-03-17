package lesson39.back.repository;

import lesson39.back.entity.Note;

import java.util.List;
import java.util.Optional;

public interface InMemoryRepository {

    Note add(String noteName,String noteDescription);

    List<Note> findAll();

    Optional<Note> findById(Integer id);

    List<Note> findByName(String noteName);

    Note updateNote(Note noteForUpdate,String updateNoteDescription);

    Note deleteNote(Note noteForDelete);
}
