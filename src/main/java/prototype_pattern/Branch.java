package prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class Branch implements Cloneable {
    private List<Commit> commitLogs;

    public Branch() {
        this.commitLogs = new ArrayList<Commit>();
    }

    public void commit(String message) {
        Commit newCommit = new Commit(commitLogs.size(), message);
        commitLogs.add(newCommit);
    }

    public void history() {
        System.out.println("\n===== VERSION INFO =====");
        commitLogs.forEach(commit -> System.out.println(commit.toString()));
        System.out.println("========================\n");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Branch cloned = (Branch) super.clone();
        cloned.commitLogs = new ArrayList<>(commitLogs);
        return cloned;
    }
}
