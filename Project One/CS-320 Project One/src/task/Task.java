package task;

public class Task {
	
	private String taskId;
	private String taskName;
	private String taskDescription;
	
	public Task(String uniqueTaskId, String requiredName, String requiredDescription) {
		if(uniqueTaskId == null || uniqueTaskId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID! ID cannot be null or greater than 10 characters.");
		}
		if(requiredName == null || requiredName.length() > 20) {
			throw new IllegalArgumentException("Invalid name! Name cannot be null or greater than 20 characters.");
		}
		if(requiredDescription == null || requiredDescription.length() > 50) {
			throw new IllegalArgumentException("Invalid description! Description cannot be null or greater than 50 characters.");
		}
		
		this.taskId = uniqueTaskId;
		this.taskName = requiredName;
		this.taskDescription = requiredDescription;
	}

	
	//Getters and Setters
	public String getUniqueTaskId() {
		return taskId;
	}

	final public void setUniqueTaskId(final String uniqueTaskId) {
		this.taskId = uniqueTaskId;
	}
	
	public String getRequiredName() {
		return taskName;
	}

	public void setRequiredName(String taskName) {
		this.taskName = taskName;
	}

	public String getRequiredDescription() {
		return taskDescription;
	}

	public void setRequiredDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
}