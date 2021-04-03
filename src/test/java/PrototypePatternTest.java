import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import prototype_pattern.Git;
import prototype_pattern.Branch;

public class PrototypePatternTest {
    @BeforeEach
    void init(TestInfo testInfo) {
        String className = testInfo.getTestClass().orElseThrow().getSimpleName();
        String methodName = testInfo.getTestMethod().orElseThrow().getName();
        System.out.println("============= Test [" + className + " - " + methodName + "] =============");
    }

    @Test
    public void gitSimulation() throws CloneNotSupportedException {
        Git git = new Git();

        git.listAllBranches();
        Branch current = git.getCurrent();

        current.commit("Initialize with README");
        current.commit("Hello world");

        // Checkout to first branch
        current = git.checkout("first");
        current.commit("Committed to first branch.");

        // Checkout to second branch from master
        git.checkout("master");
        current = git.checkout("second");
        current.commit("Committed to second branch.");

        // Checkout to master branch
        current = git.checkout("master");
        current.commit("Committed to master branch.");

        // View commit logs
        current = git.checkout("master");
        current.history();
        current = git.checkout("first");
        current.history();
        current = git.checkout("second");
        current.history();

        git.listAllBranches();
    }
}