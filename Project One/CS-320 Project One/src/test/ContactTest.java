package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	// Verifying that adding a properly formatted contact works.
	@Test
	void testContact() {
		Contact testContact = new Contact("0123456789", "firstname", "lastnameee", "8881234567", "1234 Market St, Philly, PA");
		assertTrue(testContact.getID().equals("0123456789"));
		assertTrue(testContact.getFirstName().equals("firstname"));
		assertTrue(testContact.getLastName().equals("lastnameee"));
		assertTrue(testContact.getPhone().equals("8881234567"));
		assertTrue(testContact.getAddress().equals("1234 Market St, Philly, PA"));
	}

	// Verify exception thrown if ID is not 10 characters or is null.
	@Test
	void testIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01234567890", "firstname", "lastname", "8881234567", "1234 Market St, Philly, PA");
		});		
	}
	
	@Test
	void testIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "firstname", "lastname", "8881234567", "1234 Market St, Philly, PA");
		});		
	}
	
	@Test
	void testIDTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456", "firstname", "lastname", "8881234567", "1234 Market St, Philly, PA");
		});		
	}
	
	// Verify exception thrown when input too long/short/null. 
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "firstnamelooooong", "lastname", "8881234567", "1234 Market St, Philly, PA");
		});		
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", null, "lastname", "8881234567", "1234 Market St, Philly, PA");
		});		
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "firstname", "lastnameloooooong", "8881234567", "1234 Market St, Philly, PA");
		});		
	}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "firstname", null, "8881234567", "1234 Market St, Philly, PA");
		});		
	}
	
	// Verify phone number is 10 digits
	@Test
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "firstname", "lastname", "888881234567", "1234 Market St, Philly, PA");
		});		
	}
	
	@Test
	void testPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "firstname", "lastname", "88812345", "1234 Market St, Philly, PA");
		});		
	}
	
	@Test
	void testPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "firstname", "lastname", null, "1234 Market St, Philly, PA");
		});		
	}
	
	// Verify exception thrown if address is over 30 characters or null
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "firstname", "lastname", "8881234567", "1234 Market St, Philly, PAaaaaaaaaaaaaaaaaaAAAAAaaaA");
		});		
	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "firstname", "lastname", "8881234567", null);
		});		
	}
	

}