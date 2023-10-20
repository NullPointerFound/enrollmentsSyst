package com.hackathon.enrollmentSystem.enrollmentSystem.service;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Contact;

import java.util.List;

public interface ContactService {

    public Contact createNewContact(Contact contact);

    public void deleteContactById(Long contactId);

    public List<Contact> getAllContacts();

    public Contact getContactById(Long contactId);
}
