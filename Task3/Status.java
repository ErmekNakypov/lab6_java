package lab6.Task3;

public enum Status {
    OPEN(3),
    IN_PROGRESS(4),
    RESOLVED(2),
    CLOSED(1);

    private Integer st;

    Status(int st) {
        this.st = st;
    }

    public Integer getSt() {
        return st;
    }
}
