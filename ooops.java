public class Ooops {

    public static void main(String[] args) {

        // =====================================
        // 1. DEFAULT CONSTRUCTOR
        // =====================================

        Oops A = new Oops();

        A.id = 1;
        A.age = 20;
        A.name = "John";
        A.subject = 3;

        System.out.println("Default Constructor:");
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.name);
        System.out.println(A.subject);

        A.study();
        A.sleep();
        A.bunk();


        // =====================================
        // 2. ENCAPSULATION
        // =====================================

        Oops B = new Oops(2, 20, "Rahul", 4, "Jane");

        System.out.println("\nEncapsulation:");

        // Getter
        System.out.println("Name: " + B.getName());
        System.out.println("Old Age: " + B.getAge());

        // Setter
        B.setAge(35);

        System.out.println("New Age: " + B.getAge());

        B.study();
        B.sleep();
        B.bunk();


        // =====================================
        // 3. PARAMETERIZED CONSTRUCTOR
        // =====================================

        Oops C = new Oops(3, 21, "Aditya", 5, "Private");

        System.out.println("\nParameterized Constructor:");

        System.out.println("Name: " + C.name);
        System.out.println("Age: " + C.age);
        System.out.println("ID: " + C.id);
        System.out.println("Subject: " + C.subject);

        C.study();
        C.sleep();
        C.bunk();


        // =====================================
        // 4. COPY CONSTRUCTOR
        // =====================================

        Oops D = new Oops(C);

        System.out.println("\nCopy Constructor:");

        System.out.println("Name: " + D.name);
        System.out.println("Age: " + D.age);
        System.out.println("ID: " + D.id);
        System.out.println("Subject: " + D.subject);

        D.study();
        D.sleep();
        D.bunk();
    }
}