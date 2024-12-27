
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

public class TaskList {
    private ListModel<Task> listModel;
    private JList<Task> taskList;

    public TaskList(ListModel<Task> listModel) {
        this.listModel = listModel;
        this.taskList = new JList<>(listModel);
    }

    public void addTask(Task task) {
        // Note: ListModel does not provide an add method, 
        // so you would need to cast it to a specific implementation 
        // that provides this functionality, such as DefaultListModel.
    }

    public void removeTask(int index) {
        // Note: ListModel does not provide a remove method, 
        // so you would need to cast it to a specific implementation 
        // that provides this functionality, such as DefaultListModel.
    }

    public void updateTask(int index, Task task) {
        // Note: ListModel does not provide a set method, 
        // so you would need to cast it to a specific implementation 
        // that provides this functionality, such as DefaultListModel.
    }

    public JList<Task> getTaskList() {
        return taskList;
    }
    public static void main(String[] args) {
        DefaultListModel<Task> listModel = new DefaultListModel<>();
        TaskList taskList = new TaskList(listModel);

        Task task1 = new Task("Buy groceries", "Milk, eggs, bread", "Medium", "Today");
        Task task2 = new Task("Do laundry", "Wash, dry, fold", "Low", "Tomorrow");

        listModel.addElement(task1);
        listModel.addElement(task2);

        JList<Task> list = taskList.getTaskList();
        // Add the list to your GUI
    }
}
