package lab6.Task3;

import java.util.ArrayList;
import java.util.List;

public class CommercialSystem {

    private List<Task> tasks;
    public CommercialSystem() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        if (task != null)
            tasks.add(task);
        else
            throw new NullPointerException("Empty object");
    }

    public void listOfTasks() {
        if (tasks.isEmpty())
            System.out.println("There are no tasks");
        else {
            System.out.println("List of tasks:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void updateTask(Task task, int index) {
        if (index < 0)
            throw new IllegalStateException("Out of index");
        if (task == null)
            throw new NullPointerException("Empty object");
        this.tasks.set(index, task);
    }

    public void removeById(int id) {
        tasks.remove(getElementIndex(id));
    }

    private int getElementIndex(int id) {
        for (Task task : tasks) {
            if (task.getId() == id)
                return this.tasks.indexOf(task);
        }
        throw new IllegalArgumentException("Invalid id");
    }
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
