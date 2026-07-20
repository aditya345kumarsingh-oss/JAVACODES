package transport;

public class moter extends vehical {

    public String handle;
    public String supension;

    public moter(String name, int model, String nooftyer,
                 String handle, String supension) {

        super(name, model, nooftyer);

        this.handle = handle;
        this.supension = supension;
    }

    public void wheel() {
        System.out.println("Motor is moving");
    }
}