/*
 * ContactService.java manages the contact objects.  Methods include
 * adding a contact, deleting a contact, updating contact attributes, 
 * and returning the new/updated contact.
 * 
 * @Author: Carl LaLonde
 * @Date: 3/23/2025
 */

package com.lalonde.contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	//A map to store contacts using the contact ID as they key.
	private final Map<String, Contact> contacts = new HashMap<>();
	
	//Adds a new contact.
	public void addContact(Contact contact) {
		if (contacts.containsKey(contact.getContactId()))
			//throws an exception if contactId already exists.
			throw new IllegalArgumentException("Contact ID already exists");
		contacts.put(contact.getContactId(), contact);
	}

	//Deletes a contact.
	public void deleteContact(String contactId) {
		if (!contacts.containsKey(contactId))
			//throws an exception in the contact does not exist.
			throw new IllegalArgumentException("Contact ID not found");
		contacts.remove(contactId);
	}
	
	//Updates the first name of a contact.
	public void updateFirstName(String contactId, String firstName) {
		contacts.get(contactId).setFirstName(firstName);
	}
	
	//Updates the last name of a contact.
	public void updateLastName(String contactId, String lastName) {
		contacts.get(contactId).setLastName(lastName);
	}
	
	//Updates the phone number of a contact.
	public void updatePhoneNumber(String contactId, String phoneNumber) {
		contacts.get(contactId).setPhoneNumber(phoneNumber);
	}
	
	//Updates an address of a contact.
	public void updateAddress(String contactId, String address) {
		contacts.get(contactId).setAddress(address);
	}
	
	//Returns the contact by contact ID.
	public Contact getContact(String contactId) {
		return contacts.get(contactId);
	}
} 
