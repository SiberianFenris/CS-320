package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import appointments.Appointment;
import appointments.AppointmentService;


class AppointmentServiceTest {
	
	Date currentDate = new Date();

	 @Test
	   public void testMethodAddPass() {
		 AppointmentService cs = new AppointmentService();
		 Appointment c1 = new Appointment("1", currentDate, "Testing one");
		 Appointment c2 = new Appointment("2", currentDate, "Testing two");
		 Appointment c3 = new Appointment("3", currentDate, "Testing three");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	   }

	 @Test
	   public void testMethodAddFail() {
		  AppointmentService cs = new AppointmentService();
		  Appointment c1 = new Appointment("1", currentDate, "Testing one");
		  Appointment c2 = new Appointment("2", currentDate, "Testing two");
		  Appointment c3 = new Appointment("3", currentDate, "Testing three");
	       assertEquals(true, cs.add(c1));
	       assertEquals(false, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));
	   }
	   
	 @Test
	   public void testMethodDeletePass() {
		   AppointmentService cs = new AppointmentService();
		   Appointment c1 = new Appointment("1", currentDate, "Testing one");
		   Appointment c2 = new Appointment("2", currentDate, "Testing two");
		   Appointment c3 = new Appointment("3", currentDate, "Testing three");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.remove("1"));
	       assertEquals(true, cs.remove("2"));
	   }

	 @Test
	   public void testMethodDeleteFail() {
		   AppointmentService cs = new AppointmentService();
		   Appointment c1 = new Appointment("1", currentDate, "Testing one");
		   Appointment c2 = new Appointment("2", currentDate, "Testing two");
		   Appointment c3 = new Appointment("3", currentDate, "Testing three");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));
	       assertEquals(false, cs.remove("4"));
	       assertEquals(true, cs.remove("2"));
	   }
	}