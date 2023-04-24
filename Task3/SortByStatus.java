package lab6.Task3;

import java.util.Comparator;

public class SortByStatus implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        if (o1.getStatus().getSt() > o2.getStatus().getSt())
            return -1;
        else if (o1.getStatus().getSt() < o2.getStatus().getSt())
            return 1;
        return 0;
    }
}
