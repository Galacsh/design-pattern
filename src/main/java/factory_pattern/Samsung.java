package factory_pattern;

public class Samsung extends PhoneFactory {
    @Override
    public Phone make() {
        Phone iphone = new Phone();
        iphone.setMadeBy("Samsung");
        return iphone;
    }

    private void androidSetting(Phone phone) {
        System.out.println("Configuring Android >> " + phone.getName());
    }

    @Override
    public void setHardware(Phone phone) {
        System.out.println("Setting hardware of " + phone.getName());
        androidSetting(phone);
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
