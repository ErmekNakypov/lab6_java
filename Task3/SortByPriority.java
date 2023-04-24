package lab6.Task3;

import java.util.Comparator;

public class SortByPriority implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        if (o1.getPriority().getPr() > o2.getPriority().getPr())
            return -1;
        else if (o1.getPriority().getPr() < o2.getPriority().getPr())
            return 1;
        return 0;
    }
}

