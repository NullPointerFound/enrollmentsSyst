package com.hackathon.enrollmentSystem.enrollmentSystem.controller;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Contact;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.ContactService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/contact")
@AllArgsConstructor
public class ContactController {

    private ContactService contactService;

    @PostMapping
    public Contact newContact(@RequestBody Contact contact){
        return contactService.createNewContact(contact);
    }

    @DeleteMapping("/{contactId}")
    public String deleteContactById(@PathVariable Long contactId){
        contactService.deleteContactById(contactId);
        return "Contact has been deleted";
    }

    @GetMapping
    public List<Contact> getAllContact(){
        return contactService.getAllContacts();
    }

    @GetMapping("/{contactId}")
    public Contact getContactById(Long contactId){
        return contactService.getContactById(contactId);
    }
}
