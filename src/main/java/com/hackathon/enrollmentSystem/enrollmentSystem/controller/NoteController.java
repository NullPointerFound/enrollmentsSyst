package com.hackathon.enrollmentSystem.enrollmentSystem.controller;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Note;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.NoteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/note")
@AllArgsConstructor
public class NoteController {

    private NoteService noteService;

    @PostMapping("/{applicationId}")
    public Note createNote(@RequestBody Note note, @PathVariable Long applicationId){
        return noteService.createNote(note, applicationId);
    }

    @DeleteMapping("/{noteId}")
    public String deleteNoteById(@PathVariable Long noteId){
        noteService.deleteNoteById(noteId);
        return "Note has been deleted successfully";
    }

    @PutMapping("/{noteId}")
    public Note updateNoteById(Long noteId, @RequestBody Note note){
        return noteService.updateNoteById(noteId, note);
    }


    @GetMapping("/{noteId}")
    public Note getNoteById(@PathVariable Long noteId){
        return noteService.getNoteById(noteId);
    }

    @GetMapping("/application/{applicationId}")
    public List<Note> getNotesByApplicationId(@PathVariable Long applicationId){

        return noteService.getNotesByApplicationId(applicationId);
    }

}
