package com.hackathon.enrollmentSystem.enrollmentSystem.service;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Note;

import java.util.List;

public interface NoteService {

    public Note createNote(Note note, Long applicationId);

    public void deleteNoteById(Long noteId);

    public Note updateNoteById(Long noteId, Note note);

    public Note getNoteById(Long noteId);

    public List<Note> getNotesByApplicationId(Long applicationId);


}
