package com.reece.addressbook.service;

import java.util.ArrayList;
import java.util.List;
import com.reece.addressbook.exception.EmptyAddressBookException;
import com.reece.addressbook.model.Contact;

public class AddressBook {

    List<Contact> contacts;
    private String name;
    
    /** setters, getters**/
    
    public AddressBook(final String name) {
        this.name = name;
        contacts = new ArrayList<Contact>();
    }

    public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addContact(final Contact contact) {
        contacts.add(contact);
    }

    public boolean removeContact(Contact contact) {
        return contacts.remove(contact);    
    }

    public void printContacts() throws EmptyAddressBookException {
        if (getContacts() != null && !getContacts().isEmpty()) {
            System.out.println(this);
        } else {
        	System.out.println("Address Book is empty");;
        }
    }

   
}