public class method {

    // =========================
    // Simple Method
    // =========================
    static void table() {
        System.out.println("Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }

    // =========================
    // Parameterized Method
    // =========================
    static void sum(int x, int y) {
        System.out.println("Sum = " + (x + y));
    }

    // =========================
    // Non-Void Method
    // =========================
    static int add(int a, int b) {
        return a + b;
    }

    // =========================
    // Method Overloading
    // =========================
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // =========================
    // Call by Value
    // =========================
    static void change(int a) {
        System.out.println("Value inside method before change: " + a);
        a = a * 10;
        System.out.println("Value inside method after change: " + a);
    }

    // =========================
    // Main Method
    // =========================
    public static void main(String[] args) {

        // Simple Method
        table();

        System.out.println();

        // Parameterized Method
        sum(5, 10);

        System.out.println();

        // Non-Void Method
        int addition = add(5, 10);
        System.out.println("Addition of 2 numbers = " + addition);

        System.out.println();

        // Method Overloading
        int addition2 = add(5, 10, 15);
        System.out.println("Addition of 3 numbers = " + addition2);

        System.out.println();

        // Call by Value
        int a = 5;
        System.out.println("Value before method call = " + a);
        change(a);
        System.out.println("Value after method call = " + a);
    }
}