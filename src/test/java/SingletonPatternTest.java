import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import singleton_pattern.UniqueObject;

class SingletonPatternTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        String className = testInfo.getTestClass().orElseThrow().getSimpleName();
        String methodName = testInfo.getTestMethod().orElseThrow().getName();
        System.out.println("============= Test [" + className + " - " + methodName + "] =============");
    }

    @Test
    public void unique() {
        UniqueObject hello = UniqueObject.getInstance("hello");
        System.out.println(hello);

        UniqueObject world = UniqueObject.getInstance("world");
        System.out.println(world);

        System.out.println("is hello == world ? " + (hello == world));
    }
}