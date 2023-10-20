package com.hackathon.enrollmentSystem.enrollmentSystem.service.Impl;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Contact;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.ContactRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.ContactService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;

    private ServiceHelper serviceHelper;

    @Override
    public Contact createNewContact(Contact contact) {

        return contactRepository.save(contact);
    }

    @Override
    public void deleteContactById(Long contactId) {
        Contact contactFound = serviceHelper.getContactByIdOrThrowNoFoundException(contactId);
        contactRepository.delete(contactFound);
    }

    @Override
    public List<Contact> getAllContacts() {

        return contactRepository.findAll();
    }

    @Override
    public Contact getContactById(Long contactId) {
        Contact contactFound = serviceHelper.getContactByIdOrThrowNoFoundException(contactId);
        return contactFound;
    }
}
