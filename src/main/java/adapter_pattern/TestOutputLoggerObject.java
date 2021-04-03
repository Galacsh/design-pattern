package adapter_pattern;

public class TestOutputLoggerObject implements Logger {
    private TestOutput output;

    public TestOutputLoggerObject(TestOutput output) {
        this.output = output;
    }

    @Override
    public void info(Object obj) {
        output.test(obj.toString());
    }

    @Override
    public void debug(Object obj) {
        output.test(obj.toString());
    }

    @Override
    public void warn(Object obj) {
        output.test(obj.toString());
    }

    @Override
    public void error(Object obj) {
        output.test(obj.toString());
    }
}
