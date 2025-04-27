/*
 * ContactTest.java tests the contact class using JUnit 5.  Tests
 * include tests for contact object creation, setters, and validation.
 * 
 * @Author: Carl LaLonde
 * @Date: 3/23/2025
 */


package com.lalonde.contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;	

public class ContactTest {
	
	//Tests that a valid contact object has been created
	@Test
	public void testContactCreate() {
		Contact contact = new Contact("0001", "Carl", "LaLonde", "3139379536", "6374 Michigan Ave.");
		assertEquals("0001", contact.getContactId());
		assertEquals("Carl", contact.getFirstName());
		assertEquals("LaLonde", contact.getLastName());
		assertEquals("3139379536", contact.getPhoneNumber());
		assertEquals("6374 Michigan Ave.", contact.getAddress());
	}
	
	//Tests for null values in contact.
	@Test
	public void contactFirstNameNullTest() {
		Contact contact = new Contact("0001", "Carl", "LaLonde", "3139379536", "6374 Michigan Ave.");
		assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
	}
	

	//Tests that setters correctly update attribute values.
	@Test
	public void testSetters() {
		Contact contact = new Contact("0002", "John", "Doe", "2483334444", "1234 Kinloch St");
		contact.setFirstName("Chris");
		assertEquals("Chris", contact.getFirstName());
	}
	
	//Tests for an invalid phone number.  
	@Test
	public void testInvalidPhoneNumber() {
		//throws an exception do to phone number being too long.
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0003", "Alex", "Murphy", "11122233334444", "187 Detroit Blvd.");
		});
	}
}
