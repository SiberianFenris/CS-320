package test;

import task.Task;
import task.TaskService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TaskServiceTest {

	@Test	
	void testUniqueIdAddTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("0123456789", "TaskName", "TaskDescription");
		
		assertTrue(taskService.addTask(task));
		assertTrue(taskService.taskCount() == 1);
		
	}
	
	 @Test	
		void testIdenticalIdAddTask() {
		TaskService taskService = new TaskService();
		Task task1 = new Task("0123456789", "TaskName", "TaskDescription");
		Task task2 = new Task("0123456789", "TaskName2", "TaskDescription2");
				
		assertTrue(taskService.addTask(task1));
		
		if(taskService.addTask(task2))
       {
         fail("ID is already in database.");
       }
  }
	 
	 @Test	
		void testDeleteTaskPerId() {
			TaskService taskService = new TaskService();
			Task task = new Task("0123456789", "TaskName", "TaskDescription");
			
			assertTrue(taskService.addTask(task));
			
			assertTrue(taskService.taskCount() == 1);
			
			assertTrue(taskService.deleteTask("0123456789"));
			
			assertTrue(taskService.taskCount() == 0);
				
		}
	 
	 @Test	
		void testUpdateTaskAllFieldsPerId() {
		 	TaskService taskService = new TaskService();
		 	Task task1 = new Task("0123456789", "TaskName1", "TaskDescription1");
		 	Task task2 = new Task("0123456789", "TaskName2", "TaskDescription2");
		 	assertTrue(taskService.addTask(task1)); 
		 	assertTrue(taskService.updateTask(task2));
     
      
     }
}