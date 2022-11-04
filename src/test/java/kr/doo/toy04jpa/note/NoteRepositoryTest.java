package kr.doo.toy04jpa.note;

import kr.doo.toy04jpa.entity.Note;
import kr.doo.toy04jpa.repository.NoteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NoteRepositoryTest {

    @Autowired
    NoteRepository noteRepository;

    @Test
    public void noteInsert() {
        Note note = Note.builder().desc("My Note....").build();

        noteRepository.save(note);
    }
}
