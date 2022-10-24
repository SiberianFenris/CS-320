package appointments;

import java.util.Date;

public class Appointment{
    private final String ID;
    private String description;
    private Date date;

public Appointment (String ID, Date date, String description) {
	
	Date currentDate = new Date();
	
	if(ID == null || ID.length()>10) {
		throw new IllegalArgumentException("Invalid ID");
	}
	if(date == null || currentDate.before(date)) {
		throw new IllegalArgumentException("Invalid Date");
	}
	if(description == null || description.length()>50) {
		throw new IllegalArgumentException("Invalid Description");
	}
	
	this.ID = ID;
	this.date = date;
	this.description = description;

}

//Getters and Setters

	public String getDescription() {
		return description;
	}	
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getID() {
		return ID;
	}
	
}