package factory_pattern;

public abstract class PhoneFactory {
    public Phone createPhone() {
        Phone phone = make();
        setHardware(phone);
        setSoftware(phone);
        test(phone);
        return phone;
    }

    public abstract Phone make();
    public abstract void setHardware(Phone phone);
    public abstract void setSoftware(Phone phone);
    public abstract void test(Phone phone);
}
