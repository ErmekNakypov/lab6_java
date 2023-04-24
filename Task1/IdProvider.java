package lab6.Task1;

public class IdProvider {
    private static lab6.Task2.IdProvider instance;

    public static synchronized lab6.Task2.IdProvider getInstance() {
        if (instance == null) {
            instance = new lab6.Task2.IdProvider();
        }

        return instance;
    }

    private int nextID = 1;

    public int getUniqueId() {
        if (nextID < 0) {
            throw new IllegalStateException("Out of IDs!");
        }

        int uniqueId = nextID;
        nextID++;

        return uniqueId;
    }
}