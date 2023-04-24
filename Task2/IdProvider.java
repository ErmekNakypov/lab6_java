package lab6.Task2;

public class IdProvider {
    private static IdProvider instance;

    public static synchronized IdProvider getInstance() {
        if (instance == null) {
            instance = new IdProvider();
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