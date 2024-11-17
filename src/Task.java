public class Task {
    private int id;
    private String title;
    private String description;
    private String deadlines;
    private String priority;
    private String category;
    private boolean isCompleted;

    // Constructor
    public Task( int id, String title, String description, String deadlines, String priority, String category, boolean isCompleted) {
        this.id = ++id;
        this.title = title;
        this.description = description;
        this.deadlines = deadlines;
        this.priority = priority;
        this.category = category;
        this.isCompleted = isCompleted;
    }

    //getter
    public int getid(){
        return id;
    }

    //setter
    public String getTitle(){
        return title;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String newDescription){
        this.description = newDescription;
    }

    public String deadlines(){
        return deadlines;
    }

    public void setDeadlines(String newDeadlines){
        this.deadlines = newDeadlines;
    }

    public String priority(){
        return priority;
    }

    public void setPriority(String newPriority){
        this.priority = newPriority;
    }

    public String category(){
        return category;
    }

    public void setCategory(String newCategory){
        this.category = newCategory;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    public void setCompletions(Boolean newCompletion){
        this.isCompleted = newCompletion;
    }
}
