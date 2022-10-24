package appointments;

import java.util.ArrayList;

public class AppointmentService {
   private ArrayList<Appointment> appointments;


   public AppointmentService() {
	   appointments = new ArrayList<>();
   }

   //adds  Appointments to array list
   public boolean add(Appointment appointment) {
       boolean alreadyPresent = false;
       for (Appointment c : appointments) {
           if (c.equals(appointment)) {
               alreadyPresent = true;
           }
       }
       
       if (!alreadyPresent) {
    	   appointments.add(appointment);
           System.out.println("Appointment Added Successfully!");
           return true;
       } else {
           System.out.println("Appointment already present");
           return false;
       }
   }

   //removes appointment with given ID if present
   public boolean remove(String ID) {
       for (Appointment c : appointments) {
           if (c.getID().equals(ID)) {
        	   appointments.remove(c);
               System.out.println("Appointment removed Successfully!");
               return true;
           }
       }
       System.out.println("Appointment not present");
       return false;
   }
}