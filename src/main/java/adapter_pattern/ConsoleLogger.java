package adapter_pattern;

public class ConsoleLogger implements Logger {
    public void output(String logType, Object obj) {
        System.out.println("[" + logType + "] >> " + obj.toString());
    }

    @Override
    public void info(Object obj) {
        output("INFO", obj);
    }

    @Override
    public void debug(Object obj) {
        output("DEBUG", obj);
    }

    @Override
    public void warn(Object obj) {
        output("WARN", obj);
    }

    @Override
    public void error(Object obj) {
        output("ERROR", obj);
    }
}
