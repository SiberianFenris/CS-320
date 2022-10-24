package contact;

public class Contact {
    
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
		if (id == null || id.length() != 10) {
			throw new IllegalArgumentException("Invalid Contact ID");
			
		} else if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
			
		} else if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
			
		} else if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
			
		} else if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
			
		} else {
			this.id = id;
			this.lastName = lastName;
			this.firstName = firstName;
			this.phoneNumber = phoneNumber;
			this.address = address;
		}		
	}
	
	// Getters
	public String getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhone(String phone) {
		this.phoneNumber = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object contact) {
		// Verify object not null. Verify class is contact
		if (contact == this) {
			return true;
		}
		if (contact == null) {
			return false;
		}
		if (getClass() != contact.getClass()) {
			return false;
		}
		
		// Checking for matching or null ID
		Contact other = (Contact) contact;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	

}