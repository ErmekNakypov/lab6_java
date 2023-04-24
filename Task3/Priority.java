package lab6.Task3;

public enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private Integer pr;

    Priority(int pr) {
        this.pr = pr;
    }

    public Integer getPr() {
        return pr;
    }
}
