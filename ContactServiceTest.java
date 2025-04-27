/*
 * ContactServiceTest.java tests the ContactService.java class using JUnit 5.
 * Test include adding a new contact, deleting a contact, and updating contact 
 * attributes.
 * 
 * @Author: Carl LaLonde
 * @Date: 3/23/2025
 */


package com.lalonde.contact;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ContactServiceTest {

	private ContactService service;
	
	//Initializes a new contact service before each test.
	@BeforeEach
	public void setup() {
		service = new ContactService();
	}
	
	//Tests adding a new contact.
	@Test
	public void addContactTest() {
		Contact contact = new Contact("1001", "Jim", "Parsons", "5555555555", "9999 Old Road Rd.");
		service.addContact(contact);
		assertEquals("Jim", service.getContact("1001").getFirstName());
	}
	
	//Tests adding a contact that already exists.
	@Test
	public void duplicateContactTest() {
		Contact contact1 = new Contact("0001", "Carl", "LaLonde", "1112223333", "1234 Road");
		Contact contact2 = new Contact("0001", "Carl", "LaLonde", "1112223333", "1234 Road");
		service.addContact(contact1);
		assertThrows(IllegalArgumentException.class, () -> {
			service.addContact(contact2);
		});
	}
	
	//Tests deleting a contact.
	@Test
	public void deleteContactTest() {
		Contact contact = new Contact("1002", "Tim", "Allen", "3139998888", "1234 Western Way");
		service.addContact(contact);
		service.deleteContact("1002");
		assertNull(service.getContact("1002"));
	}
	
	//Tests updating a contact phone number.
	@Test
	public void updatePhoneNumberTest() {
		Contact contact = new Contact("2001", "SaraAnn", "Doo", "7342484444", "33998 Ohio St");
		service.addContact(contact);
		service.updatePhoneNumber("2001", "3132484444");
		assertEquals("3132484444", service.getContact("2001").getPhoneNumber());
	}
}
