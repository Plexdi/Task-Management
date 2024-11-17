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

    public void setTitle(){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description = description;
    }

    public String deadlines(){
        return deadlines;
    }

    public void setDeadlines(){
        this.deadlines = deadlines;
    }

    public String priority(){
        return priority;
    }

    public void setPriority(){
        this.priority = priority;
    }

    public String category(){
        return category;
    }

    public void setCategory(){
        this.category = category;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    public void setCompletions(){
        this.isCompleted = isCompleted;
    }
}
