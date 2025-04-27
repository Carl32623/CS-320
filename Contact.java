/*
 * Contact.java represents adding contact attributes to a list.  Fields for ID, 
 * First Name, Last Name, Phone Number and Address are to be filled out and not null.
 * 
 * @Author: Carl LaLonde
 * @Date: 3/23/2025
 */



package com.lalonde.contact;

public class Contact {
	
	//Unique contact ID identifier.
	private final String contactId;
	//Attributes for contact information.
	private String firstName, lastName, phoneNumber, address;
	
	//Constructor to initialize new contact.
	public Contact (String contactId, String firstName, String lastName, String phoneNumber, String address) {
		if (contactId == null || contactId.trim().length() > 10)
			throw new IllegalArgumentException("Contact ID is invalid");
		if (firstName == null || firstName.trim().length() > 10)
			throw new IllegalArgumentException("First name is invalid");
		if (lastName == null || firstName.trim().length() > 10)
			throw new IllegalArgumentException("Last name is invalid");
		if (phoneNumber == null || phoneNumber.trim().length() != 10)
			throw new IllegalArgumentException("Phone number is invalid");
		if (address == null || address.trim().length() > 30) 
			throw new IllegalArgumentException("Address is invalid");
	
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	//Getters
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	//Setters
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10)
			throw new IllegalArgumentException("First name is invalid");
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10)
			throw new IllegalArgumentException("Last name is invalid");
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10)
			throw new IllegalArgumentException("Phone number is invalid");
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30) 
			throw new IllegalArgumentException("Address is invalid");
		this.address = address;
	}
}
