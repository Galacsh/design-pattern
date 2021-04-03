import factory_pattern.Apple;
import factory_pattern.Phone;
import factory_pattern.PhoneFactory;
import factory_pattern.Samsung;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class FactoryTemplateTest {
    @BeforeEach
    void init(TestInfo testInfo) {
        String className = testInfo.getTestClass().orElseThrow().getSimpleName();
        String methodName = testInfo.getTestMethod().orElseThrow().getName();
        System.out.println("============= Test [" + className + " - " + methodName + "] =============");
    }

    @Test
    public void appleFactoryTest() {
        PhoneFactory phoneFactory;

        phoneFactory = new Apple();
        Phone iphone = phoneFactory.createPhone();
        iphone.ring();

        phoneFactory = new Samsung();
        Phone galaxy = phoneFactory.createPhone();
        galaxy.ring();
    }
}