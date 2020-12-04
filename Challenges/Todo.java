import java.io.*;

public class Todo {
    private long description;
    private String due;
    private boolean isDone = false;
    private int priority;
    PrintWriter output = new PrintWriter("data.md");

    public Task(long description, String due, int priority) {
        this.description = description;
        this.due = due;
        this.priority = priority;
    }

    public String toString() {
        output.println("Task: " + description "\nDue: " + due + "\nPriority: " + priority + "\nDone? " + isDone +"\n");
    }
}