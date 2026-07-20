package transport;

public class car  extends vehical{
    public int noofdoor;
    public String transmission;
    car(String name, int model, String nooftyer, int noofdoor, String transmission) {
        super(name, model, nooftyer);
        this.noofdoor = noofdoor;
        this.transmission = transmission;
        

    }

    public void startac() {
        System.out.println("ac is starting");
    }
}
