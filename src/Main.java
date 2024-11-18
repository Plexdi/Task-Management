public class Main {
    public static void main(String[] args) {
        TaskManager taskManger = new TaskManager();

        // Create Task objects
        Task task1 = new Task(1, "Finish Homework", "Complete math and science assignments", "2023-10-20", "High", "School", false);
        Task task2 = new Task(1, "Grocery Shopping", "Buy milk, bread, and eggs", "2023-10-18", "Medium", "Personal", false);

        taskManger.addTask(task1);
        taskManger.addTask(task2);

        taskManger.viewTask("view all");

    }
}
