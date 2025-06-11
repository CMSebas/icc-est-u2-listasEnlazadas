package controller;

import models.LinkedList;

import models.Contact;
import models.Node;

public class ContactManager {
    private LinkedList<Contact> contacts = new LinkedList<>();

    public void addContact(Contact contact) {
        contacts.appendToTail(contact);
    }   

    public Contact findContactByName(String name) {
    return contacts.findByValue(new Contact(name, ""));
    }

    public void deleteContactByName(String name) {
    contacts.deleteByValue(new Contact(name, ""));
}

public void printList() {
        contacts.print();
    }




    
}
