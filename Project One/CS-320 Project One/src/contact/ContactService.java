package contact;

import java.util.ArrayList;

public class ContactService {
	// Array stores contacts
	private ArrayList<Contact> contactList;
	
	public ContactService() {
		contactList = new ArrayList<>();
	}
	
	public boolean AddContact(Contact newContact) {
		boolean duplicate = false;
		for (Contact listContact : contactList) {
			if (listContact.equals(newContact)) {
				duplicate = true;
			}
		}
		
		if (!duplicate) {
			contactList.add(newContact);
			System.out.println("New contact added!");
			return true;
		} else {
			System.out.println("Duplicate contact!");
			return false;
		}
	}
	
	public boolean DeleteContact(String id) {
		for (Contact listContact : contactList) {
			if (listContact.getID().equals(id)) {
				contactList.remove(listContact);
				System.out.println("Delete completed!");
				return true;
			}
			
		}
		System.out.println("No contact found!");
		return false;
	}
	
	public boolean UpdateContact(String id, String firstName, String lastName, String phone, String address) {
		for (Contact listContact : contactList) {
			if (listContact.getID().equals(id)) {
				if (!firstName.equals("") & firstName.length() < 11) {
					listContact.setFirstName(firstName);
				}
				if (!lastName.equals("") & lastName.length() < 11) {
					listContact.setLastName(lastName);
				}
				if (!phone.equals("") & phone.length() == 10) {
					listContact.setPhone(phone);
				}
				if (!address.equals("") & address.length() < 30) {
					listContact.setAddress(address);
				}
				System.out.println("Update complete!");
				return true;
			}
		}
		System.out.println("No contact found or invalid data entered.");
		return false;
	}
}