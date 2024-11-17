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
    

    //edit task 
    public void editTask(int taskID, String[] section, Object newValue){
        Task taskToEdit = null;
        String[] opt = {"title", "description", "deadlines", "priority", "category"};
        for (Task t : tasks){ //loop through the array 
            if (t.getid() == taskID){ //check for ID 
                taskToEdit = t;
            }
        }
        if (taskToEdit == null){
            System.out.println("Task not found");
        }
        
        for (String choice : section){
            for (String option : opt){
                if (option == choice){
                    switch (choice.toLowerCase()){
                        case "title":
                            taskToEdit.setTitle((Object) newValue);
                    }
                }
            }
        }

    }
}
