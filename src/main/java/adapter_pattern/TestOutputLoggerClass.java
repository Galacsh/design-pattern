package adapter_pattern;

public class TestOutputLoggerClass extends TestOutput implements Logger {
    @Override
    public void info(Object obj) {
        test(obj.toString());
    }

    @Override
    public void debug(Object obj) {
        test(obj.toString());
    }

    @Override
    public void warn(Object obj) {
        test(obj.toString());
    }

    @Override
    public void error(Object obj) {
        test(obj.toString());
    }
}
