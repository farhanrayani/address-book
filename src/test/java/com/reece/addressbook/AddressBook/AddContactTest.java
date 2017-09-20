package com.reece.addressbook.AddressBook;

import static org.junit.Assert.*;

import org.junit.Test;

import com.reece.addressbook.model.Contact;

public class AddContactTest {

    /**
     * Test for invalid contact with empty contact name
     */
	@Test
	public void testInvalidContactName() {
	    boolean hasRaised = false;
	    try {
	       new Contact("farhan", "95679876");
	    } catch (final IllegalArgumentException ex){
	        hasRaised = true;
	    }
	    assertFalse("The name should not be empty!", hasRaised);
	}
	
	/**
     * Test for invalid contact with empty contact number
     */
	@Test
	public void testInvalidContactNumber() {
	    boolean hasRaised = false;
	    try {
	       new Contact("farhan", "87654321");
	    } catch (final IllegalArgumentException ex){
	        hasRaised = true;
	    }
	    assertFalse("The number should not be empty!", hasRaised);
	}
	
    /**
     * Test for valid contact with valid contact names and phone numbers
     */
    @Test
    public void testValidContacts() {
        Contact contact = new Contact("Farhan", "67854");
        assertEquals(contact.getName(), "Farhan");
        assertEquals(contact.getPhoneNumber(), "67854");

        contact = new Contact("Tom", "78651234");
        assertEquals(contact.getName(), "Tom");
        assertEquals(contact.getPhoneNumber(), "78651234");
    }
}