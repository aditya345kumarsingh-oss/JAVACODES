public class Oops {

    // Attributes / Data Members
    public int id;
    public int age;
    public String name;
    public int subject;
    private String gf;


    // =========================
    // ENCAPSULATION
    // Getter Methods
    // =========================

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGf() {
        return this.gf;
    }


    // Setter Methods
    public void setAge(int age) {
        this.age = age;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }


    // =========================
    // DEFAULT CONSTRUCTOR
    // =========================

    public Oops() {
        System.out.println("Default constructor called");
    }


    // =========================
    // PARAMETERIZED CONSTRUCTOR
    // =========================

    public Oops(int id, int age, String name, int subject, String gf) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.subject = subject;
        this.gf = gf;
    }


    // =========================
    // COPY CONSTRUCTOR
    // =========================

    public Oops(Oops other) {
        this.id = other.id;
        this.age = other.age;
        this.name = other.name;
        this.subject = other.subject;
        this.gf = other.gf;
    }


    // =========================
    // METHODS / BEHAVIOUR
    // =========================

    public void study() {
        System.out.println("Studying");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public void bunk() {
        System.out.println("Bunking");
    }


    // Private Method
    private void gf() {
        System.out.println("Private gf method called");
    }


    // Public method to access private method
    public void callGfMethod() {
        gf();
    }


    // =========================
    // MAIN METHOD
    // =========================

    public static void main(String[] args) {

        // Default Constructor
        Oops student1 = new Oops();

        student1.id = 1;
        student1.name = "Aditya";
        student1.setAge(20);
        student1.subject = 5;
        student1.setGf("Private Data");

        System.out.println("\nStudent 1 Details:");
        System.out.println("ID: " + student1.id);
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Subjects: " + student1.subject);
        System.out.println("GF: " + student1.getGf());

        student1.study();
        student1.sleep();
        student1.bunk();


        // Parameterized Constructor
        Oops student2 = new Oops(
                2,
                21,
                "Rahul",
                6,
                "Private Data 2"
        );

        System.out.println("\nStudent 2 Details:");
        System.out.println("ID: " + student2.id);
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("Subjects: " + student2.subject);
        System.out.println("GF: " + student2.getGf());


        // Copy Constructor
        Oops student3 = new Oops(student2);

        System.out.println("\nStudent 3 Details (Copy of Student 2):");
        System.out.println("ID: " + student3.id);
        System.out.println("Name: " + student3.name);
        System.out.println("Age: " + student3.age);
        System.out.println("Subjects: " + student3.subject);
        System.out.println("GF: " + student3.getGf());


        // Accessing private method indirectly
        student1.callGfMethod();
    }
}