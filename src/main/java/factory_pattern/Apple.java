package factory_pattern;

public class Apple extends PhoneFactory {
    @Override
    public Phone make() {
        Phone iphone = new Phone();
        iphone.setMadeBy("Apple");
        return iphone;
    }

    @Override
    public void setHardware(Phone phone) {
        System.out.println("Setting hardware of " + phone.getName());
    }

    @Override
    public void setSoftware(Phone phone) {
        System.out.println("Setting software of " + phone.getName());
    }

    @Override
    public void test(Phone phone) {
        System.out.println("Testing " + phone.getName());
    }
}
