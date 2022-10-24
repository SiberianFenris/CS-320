package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import appointments.Appointment;

class AppointmentClassTest {
  
	Date currentDate = new Date();
		
	@Test
	void testAppointment() {
		Appointment appointment = new Appointment("123", currentDate,"SNHU Professor");
		assertTrue(appointment.getID().equals("123"));
		assertTrue(appointment.getDate().equals(currentDate));
		assertTrue(appointment.getDescription().equals("SNHU Professor"));
		}
		
	@Test
	void testAppointmentClassIdToLong() {		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1234567891011", currentDate, "SNHU Professor");
		 });      }
	
	
	@Test
	void testAppointmentClassDescriptionToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("123456789", currentDate,"This description is over fifty characters long. It should be shorter.");
		 });      }
	
	@Test
	void testAppointmentClassIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, currentDate, "SNHU Professor");
			});      }
			
	@Test
	void testAppointmentClassDateIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("123456789", null, "SNHU Professor");
			});      }
			
	@Test
	void testAppointmentClassDescriptionIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("123456789", currentDate, null);
		 });      }
	}