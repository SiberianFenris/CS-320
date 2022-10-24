package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	   // Add formatted contacts to the array.
	   @Test
	   public void TestAddContact() {
	       ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));
	   }

	   // Attempt to add duplicate contact (should fail) 
	   @Test
	   public void TestAddDuplicate() {
		   ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));
	       
	       assertEquals(false, contactService.AddContact(contact1));
	   }

	   // Delete contacts based by ID
	   @Test
	   public void TestContactDelete() {
		   ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));

	       assertEquals(true, contactService.DeleteContact("1111111111"));
	       assertEquals(true, contactService.DeleteContact("3333333333"));
	   }

	   // Attempt to delete non-existent contacts
	   @Test
	   public void TestContactDeleteDoesNotExist() {
		   ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));

	       assertEquals(false, contactService.DeleteContact("4444444444"));
	       assertEquals(true, contactService.DeleteContact("3333333333"));
	   }

	   // Update contacts by ID
	   @Test
	   public void TestContactUpdate() {
		   ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));

	       assertEquals(true, contactService.UpdateContact("1111111111", "updatename", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA"));
	       assertEquals(true, contactService.UpdateContact("3333333333", "firstname", "updatename", "3605551234", "1234 S Main Ave, Seattle, WA"));
	   }

	   // Attempt to update contact that doesn't exist
	   @Test
	   public void TestContactUpdateDoesNotExist() {
		   ContactService contactService = new ContactService();
	       Contact contact1 = new Contact("1111111111", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact2 = new Contact("2222222222", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       Contact contact3 = new Contact("3333333333", "firstname", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA");
	       assertEquals(true, contactService.AddContact(contact1));
	       assertEquals(true, contactService.AddContact(contact2));
	       assertEquals(true, contactService.AddContact(contact3));

	       assertEquals(false, contactService.UpdateContact("4444444444", "updatename", "lastname", "3605551234", "1234 S Main Ave, Seattle, WA"));
	       assertEquals(true, contactService.UpdateContact("3333333333", "firstname", "updatename", "3605551234", "1234 S Main Ave, Seattle, WA"));
	   }

}