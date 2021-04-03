import adapter_pattern.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class AdapterPatternTest {
    @BeforeEach
    void init(TestInfo testInfo) {
        String className = testInfo.getTestClass().orElseThrow().getSimpleName();
        String methodName = testInfo.getTestMethod().orElseThrow().getName();
        System.out.println("============= Test [" + className + " - " + methodName + "] =============");
    }

    @Test
    public void adapterTest() {
        Logger log = new ConsoleLogger();
        log.info("This");
        log.debug("is");
        log.error("console");
        log.warn("log.\n");

        log = new TestOutputLoggerClass();
        log.info("This");
        log.debug("is");
        log.error("TestOutputLoggerClass");
        log.warn("log.\n");

        log = new TestOutputLoggerObject(new TestOutput());
        log.info("This");
        log.debug("is");
        log.error("TestOutputLoggerObject");
        log.warn("log.");
    }
}