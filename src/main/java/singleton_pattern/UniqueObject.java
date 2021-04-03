package singleton_pattern;

public class UniqueObject {
    private final String name;
    private static UniqueObject uniqueObject;

    private UniqueObject(String name) {
        this.name = name;
    }

    public static synchronized UniqueObject getInstance(String name) {
        if(uniqueObject == null) {
            uniqueObject = new UniqueObject(name);
        }
        return uniqueObject;
    }

    @Override
    public String toString() {
        return name;
    }
}
