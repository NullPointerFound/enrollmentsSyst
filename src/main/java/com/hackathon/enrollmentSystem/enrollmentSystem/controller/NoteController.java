package com.hackathon.enrollmentSystem.enrollmentSystem.controller;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Note;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.NoteService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/note")
@AllArgsConstructor
public class NoteController {

    private NoteService noteService;

    @Operation(summary = "Adding a Note", description = "Adding a note to an application by passing a note information and the application id.")
    @SecurityRequirement(name = "Bearer Authentication")
    @PostMapping("/{applicationId}")
    public Note createNote(@RequestBody Note note, @PathVariable Long applicationId){
        return noteService.createNote(note, applicationId);
    }

    @Operation(summary = "Deleting a Note", description = "Deleting by an passing a note ID")
    @SecurityRequirement(name = "Bearer Authentication")
    @DeleteMapping("/{noteId}")
    public String deleteNoteById(@PathVariable Long noteId){
        noteService.deleteNoteById(noteId);
        return "Note has been deleted successfully";
    }

    @Operation(summary = "Updating a Note", description = "Updating a Note by an passing a note ID")
    @SecurityRequirement(name = "Bearer Authentication")
    @PutMapping("/{noteId}")
    public Note updateNoteById(Long noteId, @RequestBody Note note){
        return noteService.updateNoteById(noteId, note);
    }


    @Operation(summary = "Getting a Note", description = "Getting a note by an passing a note ID")
    @SecurityRequirement(name = "Bearer Authentication")
    @GetMapping("/{noteId}")
    public Note getNoteById(@PathVariable Long noteId){
        return noteService.getNoteById(noteId);
    }

    @Operation(summary = "Getting all Notes of a specific Application", description = "Getting all notes of a specific application by an application id")
    @SecurityRequirement(name = "Bearer Authentication")
    @GetMapping("/application/{applicationId}")
    public List<Note> getNotesByApplicationId(@PathVariable Long applicationId){

        return noteService.getNotesByApplicationId(applicationId);
    }

}
