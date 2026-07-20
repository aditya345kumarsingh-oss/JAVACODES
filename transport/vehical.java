package transport;

public class vehical {
    
    public String name;
    public int model;
    public String nooftyer;
    vehical() {
        this.name = "";
        this.model = 0;
        this.nooftyer = "";

   
    }

    vehical(String name, int model, String nooftyer) {
        this.name = name;
        this.model = model;
        this.nooftyer = nooftyer;

   
    }
    void starteng() {
        System.out.println("vehical is starting:"   +name);
    }

    void stopeng() {
        System.out.println("vehical is stopping:"   +name);
    }
}

    

