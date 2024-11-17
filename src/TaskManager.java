import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager(){
        tasks = new ArrayList<>();
    }

    //add task method
    public void addTask(Task task){
        if (tasks.contains(task)){
            System.out.println("Your task already exists");
        } else {
            tasks.add(task);
            System.out.println("Task added successfully");
        }
    }

    //remove task method 
    public void removeTask(Task task){
        if (tasks.remove(task)){
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Your task does not exist.");
        }
    }
    
    public void viewTask(String options){
        if (options.equals("view all")){
            if (tasks.isEmpty()){
                System.out.println("No Task available to display");
                return;
            }
        }

        for (Task task : tasks){
            int id = task.getid();
            String title = task.getTitle();
            String description = task.getDescription();
            String deadlines = task.deadlines();
            String priority = task.priority();
            String category = task.category();
            boolean isCompleted = task.isCompleted();

            System.out.println("Task ID: " + id);
            System.out.println("Title: " + title);
            System.out.println("Description: " + description);
            System.out.println("Deadlines: " + deadlines);
            System.out.println("Priority: " + priority);
            System.out.println("Category: " + category);
            System.out.println("Completed: " + (isCompleted ? "Yes" : "No"));
            System.out.println("-------------------------------");

        }
    }

    //edit task 
    public void editTask(int taskID, String[] section, Object newValue){
        Task taskToEdit = null;
        String[] opt = {"title", "description", "deadlines", "priority", "category"};
        for (Task t : tasks){
            if(t.getid() == taskID){
                taskToEdit = t;
                break;
            }
        }

        for (String options : opt){
            for (String choice : section){
                if (options.contains(choice)){
                    switch(choice.toLowerCase()){
                        case "title":
                        if (newValue instanceof String) {
                            taskToEdit.setTitle((String) newValue);
                        } else {
                            System.out.println("Invalid value for title. Expected a String.");
                        }
                        break;
                    case "description":
                        if (newValue instanceof String) {
                            taskToEdit.setDescription((String) newValue);
                        } else {
                            System.out.println("Invalid value for description. Expected a String.");
                        }
                        break;
                    case "deadlines":
                        if (newValue instanceof String) {
                            taskToEdit.setDeadlines((String) newValue);
                        } else {
                            System.out.println("Invalid value for deadlines. Expected a String.");
                        }
                        break;
                    case "priority":
                        if (newValue instanceof String) {
                            taskToEdit.setPriority((String) newValue);
                        } else {
                            System.out.println("Invalid value for priority. Expected a String.");
                        }
                        break;
                    case "category":
                        if (newValue instanceof String) {
                            taskToEdit.setCategory((String) newValue);
                        } else {
                            System.out.println("Invalid value for category. Expected a String.");
                        }
                        break;
                    case "completion":
                        if (newValue instanceof Boolean) {
                            taskToEdit.setIsCompleted((Boolean) newValue);
                        } else {
                            System.out.println("Invalid value for completion. Expected a Boolean.");
                        }
                        break;
                    default:
                        System.out.println("Invalid attribute: " + section);
                        break;
                    }
                }
            }
        }
    }
}
