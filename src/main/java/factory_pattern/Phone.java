package factory_pattern;

public class Phone {
    private String madeBy;

    public void ring() {
        System.out.println(madeBy + " ringing..");
    }

    public String getName() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }
}
