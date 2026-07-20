package transport;
public class main {
   public static void main(String[] args) {

         car c = new car("toyota", 2020, "4 wheeler", 4, "automatic");
        System.out.println("Name : " + c.name);
        System.out.println("Model : " + c.model);
        System.out.println("Number of Tyres : " + c.nooftyer);
        System.out.println("Number of Doors : " + c.noofdoor);
        System.out.println("Transmission : " + c.transmission);
        c.starteng();
         c.startac();
         c.stopeng();

        // moter m = new moter("moter1", 2020, "2 wheeler", "handlebar", "coil");
        // System.out.println("Name : " + m.name);
        // System.out.println("Model : " + m.model);
        // System.out.println("Number of Tyres : " + m.nooftyer);
        // System.out.println("Handle : " + m.handle);
        // System.out.println("Suspension : " + m.supension);
        // m.wheel();
        // m.starteng();
        // m.stopeng();

       
    }
}
