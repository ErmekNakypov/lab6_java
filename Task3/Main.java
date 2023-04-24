/*Output
List of tasks:
Task{id=1, description='Qwert', priority=MEDIUM, status=IN_PROGRESS}

Task{id=2, description='zzzzzzz', priority=HIGH, status=RESOLVED}

Task{id=3, description='hjghjj', priority=LOW, status=OPEN}

After updating:
List of tasks:
Task{id=1, description='Qwert', priority=MEDIUM, status=IN_PROGRESS}

Task{id=4, description='ooooooo', priority=MEDIUM, status=CLOSED}

Task{id=3, description='hjghjj', priority=LOW, status=OPEN}

Sorted by priority:
List of tasks:
Task{id=1, description='Qwert', priority=MEDIUM, status=IN_PROGRESS}

Task{id=4, description='ooooooo', priority=MEDIUM, status=CLOSED}

Task{id=3, description='hjghjj', priority=LOW, status=OPEN}

Sorted by status:
List of tasks:
Task{id=1, description='Qwert', priority=MEDIUM, status=IN_PROGRESS}

Task{id=3, description='hjghjj', priority=LOW, status=OPEN}

Task{id=4, description='ooooooo', priority=MEDIUM, status=CLOSED}

Deleted all tasks:
There are no tasks
 */

package lab6.Task3;

public class Main {
    public static void main(String[] args) {
        CommercialSystem cm = new CommercialSystem();

        Task task1 = new Task();
        task1.setDescription("Qwert");
        task1.setPriority(Priority.MEDIUM);
        task1.setStatus(Status.IN_PROGRESS);

        Task task2 = new Task();
        task2.setDescription("zzzzzzz");
        task2.setPriority(Priority.HIGH);
        task2.setStatus(Status.RESOLVED);

        Task task3 = new Task();
        task3.setDescription("hjghjj");
        task3.setPriority(Priority.LOW);
        task3.setStatus(Status.OPEN);

        cm.addTask(task1);
        cm.addTask(task2);
        cm.addTask(task3);
        cm.listOfTasks();

        Task task4 = new Task();
        task4.setDescription("ooooooo");
        task4.setPriority(Priority.MEDIUM);
        task4.setStatus(Status.CLOSED);
        cm.updateTask(task4,1);
        System.out.println("After updating:");
        cm.listOfTasks();

        cm.getTasks().sort(new SortByPriority());
        System.out.println("Sorted by priority:");
        cm.listOfTasks();

        cm.getTasks().sort(new SortByStatus());
        System.out.println("Sorted by status:");
        cm.listOfTasks();

        cm.removeById(1);
        cm.removeById(3);
        cm.removeById(4);
        System.out.println("Deleted all tasks:");
        cm.listOfTasks();
    }
}
