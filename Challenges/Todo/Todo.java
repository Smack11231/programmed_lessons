public class Todo {
    private String description;
    private String due;
    private boolean isDone = false;
    private int priority;
    private int id;
    private static int taskId = 1; 

    public Todo(String description, String due, int priority) {
        this.description = description;
        this.due = due;
        this.priority = priority;
        this.id = taskId;
        taskId++;
    }

    public void setDesc(String desc) {
        description = desc;
    }
    public void setDue(String due) {
        this.due = due;
    }
    public void setPriority(int prio) {
        priority = prio;
    }
    public void complete() {
        isDone = true;
    }

    public int getID() {
        return id;
    }
    public String toString() {
        return ("Task: " + description  + "\nDue: " + due + "\nPriority: " + priority + "\nDone? " + isDone +"\n");
    }
}