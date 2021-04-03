package template_method_pattern;

public class StringDisplay extends AbstractDisplay {
    private final String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public void open() {
        System.out.println("--------------------");
    }

    @Override
    public void close() {
        System.out.println("--------------------");
    }

    @Override
    public void print() {
        System.out.println("| " + str + " |");
    }
}
