import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import template_method_pattern.AbstractDisplay;
import template_method_pattern.CharDisplay;
import template_method_pattern.StringDisplay;

class TemplateMethodTest {
    @BeforeEach
    void init(TestInfo testInfo) {
        String className = testInfo.getTestClass().orElseThrow().getSimpleName();
        String methodName = testInfo.getTestMethod().orElseThrow().getName();
        System.out.println("============= Test [" + className + " - " + methodName + "] =============");
    }

    @Test
    public void charDisplay() {
        AbstractDisplay template = new CharDisplay('*');
        template.display();

        System.out.println("");

        template = new StringDisplay("Hello");
        template.display();
    }
}