public class Tasks {
    private String taskName;
    private String taskDescription;
    private String taskPriority;
    private String taskDueDate;

    // Constructor
    public Tasks(String taskName, String taskDescription, String taskPriority, String taskDueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
        this.taskDueDate = taskDueDate;
    }

    // Getters and Setters
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    public String getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(String taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskPriority='" + taskPriority + '\'' +
                ", taskDueDate='" + taskDueDate + '\'' +
                '}';
    }
    public static void main(String[] args) {
        // Create a new Task object
        Tasks tasks = new Tasks("Buy groceries", "Milk, eggs, bread", "Medium", "Today");

        // Print task details
        System.out.println(tasks.toString());

        // Update task details
        tasks.setTaskName("Buy more groceries");
        tasks.setTaskDescription("Milk, eggs, bread, chicken");
        tasks.setTaskPriority("High");
        tasks.setTaskDueDate("Tomorrow");

        // Print updated task details
        System.out.println(tasks.toString());
    }
}
