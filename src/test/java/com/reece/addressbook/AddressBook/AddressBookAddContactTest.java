package com.reece.addressbook.AddressBook;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.reece.addressbook.core.AddressBook;
import com.reece.addressbook.core.SimpleAddressBook;
import com.reece.addressbook.model.Contact;

public class AddressBookAddContactTest {

    private Contact contact1;
    private Contact contact2;
    private Contact contact3;
    /**
     * Address book
     */
    private AddressBook addressBook;
   
    /**
     * Initializing new contacts and an address book
     */
    @Before 
    public void initialize() {
        contact1 = new Contact("David", "043216785");
        contact2 = new Contact("Daniel", "042134567");
        contact3 = new Contact("David", "0433889977");
        addressBook = new SimpleAddressBook("addrBook1");
    }

   
    /**
     * Test add multiple contacts to address book
     */
    @Test
    public void testAddMultipleContactsToAddressBook() {
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        addressBook.addContact(contact3);
        assertEquals(addressBook.getContacts().size(), 3);  
    }

    /**
     * Test add multiple contacts with duplicates to address book
     */
    @Test
    public void testAddMultipleContactsWithDuplicateToAddressBook() {
        // contact list accepts duplicate contact
        addressBook.addContact(contact1);
        addressBook.addContact(contact1);
        assertEquals(addressBook.getContacts().size(), 2);  
    }

    /**
     * Test add multiple contacts without duplicates to address book
     */
    @Test
    public void testAddContactsWithoutDuplicateToAddressBook() {    
        // contact list accepts duplicate contact
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        assertEquals(addressBook.getContacts().size(), 2);
    }
}