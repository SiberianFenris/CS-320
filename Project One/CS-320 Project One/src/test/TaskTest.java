package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task.Task;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskTest {
	
	@Test
	void testTask() {
		Task task = new Task("0123456789", "TaskName", "TaskDescription");
		assertTrue(task.getUniqueTaskId().equals("0123456789"));
		assertTrue(task.getRequiredName().equals("TaskName"));
		assertTrue(task.getRequiredDescription().equals("TaskDescription"));
	}
	
	 @Test	
		void testTaskIdNotUpdatable() { 
		 	Assertions.assertThrows(IllegalArgumentException.class,	() -> {
		 		new Task("01234567899", "TaskName", "TaskDescription");
		 	});
	}
		
	@Test
	void testTaskIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task(null, "TaskName", "TaskDescription");
		});
	}
	
	@Test
	void testTaskIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("1234567891011", "TaskName", "TaskDescription");
		});
	}
	
	@Test
	void testTaskNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123456789", null, "TaskDescription");
		});
	}
	
	@Test
	void testTaskNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123456789", "TaskNameIsWayTooLooooooooong", "TaskDescription");
		});
	}
	
	@Test
	void testTaskDescriptionIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123456789", "TaskName", null);
		});
	}
	
	@Test
	void testTaskDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123456789", "TaskName", "TaskDescriptionTooooooooooooooooooooooooooooooLooooooooooooooooooooooong");
		});
	}
}