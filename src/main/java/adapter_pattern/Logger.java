package adapter_pattern;

public interface Logger {
    public void info(Object obj);
    public void debug(Object obj);
    public void warn(Object obj);
    public void error(Object obj);
}
