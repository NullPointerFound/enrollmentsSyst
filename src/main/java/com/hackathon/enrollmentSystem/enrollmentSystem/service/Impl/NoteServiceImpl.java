package com.hackathon.enrollmentSystem.enrollmentSystem.service.Impl;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Note;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.User;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.ApplicationRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.NoteRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.NoteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoteServiceImpl implements NoteService {

    private NoteRepository noteRepository;

    private ApplicationRepository applicationRepository;

    private ServiceHelper serviceHelper;

    @Override
    public Note createNote(Note note, Long applicationId) {

        Application applicationFound = serviceHelper.getApplicationByIdOrThrowNoFoundException(applicationId);

        User authenticatedUser = serviceHelper.getAuthenticatedUser();

        note.setApplication(applicationFound);

        note.setUser(authenticatedUser);


        return noteRepository.save(note);
    }

    @Override
    public void deleteNoteById(Long noteId) {

        Note noteFound = serviceHelper.getNoteByIdOrThrowNoFoundException(noteId);

        noteRepository.delete(noteFound);
    }

    @Override
    public Note updateNoteById(Long noteId, Note note) {

        Note noteFound = serviceHelper.getNoteByIdOrThrowNoFoundException(noteId);

        return null;
    }

    @Override
    public Note getNoteById(Long noteId) {
        Note noteFound = serviceHelper.getNoteByIdOrThrowNoFoundException(noteId);
        return noteFound;
    }

    @Override
    public List<Note> getNotesByApplicationId(Long applicationId) {

        Application applicationFound = serviceHelper.getApplicationByIdOrThrowNoFoundException(applicationId);
        return noteRepository.findByApplication(applicationFound);
    }
}
