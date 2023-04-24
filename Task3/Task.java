package lab6.Task3;

public class Task {

    private Integer id;
    private String description;
    private Priority priority;

    private Status status;

    public Task() {
        this.id = IdProvider.getInstance().getUniqueId();
    }

    public Task(String description, Priority priority, Status status) {
        this.id = IdProvider.getInstance().getUniqueId();
        this.description = description;
        this.priority = priority;
        this.status = status;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.isEmpty())
            throw new IllegalArgumentException("Invalid description");
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}' + '\n';
    }
}
