package com.hackathon.enrollmentSystem.enrollmentSystem.service.Impl;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Contact;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.ContactService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContactServiceImpl implements ContactService {
    @Override
    public Contact createNewContact(Contact contact) {
        return null;
    }

    @Override
    public String deleteContactById(Long contactId) {
        return null;
    }

    @Override
    public List<Contact> getAllContacts() {
        return null;
    }

    @Override
    public Contact getContactById(Long contactId) {
        return null;
    }
}
