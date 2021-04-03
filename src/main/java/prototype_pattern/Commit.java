package prototype_pattern;

public class Commit {
    private final int index;
    private final String message;

    public Commit(int index, String message) {
        this.index = index;
        this.message = message;
    }

    public int getIndex() {
        return index;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "index=" + index +
                ", message='" + message + '\'' +
                '}';
    }
}
