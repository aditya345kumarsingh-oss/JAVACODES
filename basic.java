public class basic {

    public static void main(String[] args) {

        // =========================
        // 1. PRINT STATEMENTS
        // =========================

        System.out.println("aditya");
        System.out.println(3);
        System.out.println("3+4");
        System.out.println(3 + 4);


        // =========================
        // 2. IMPLICIT TYPE CASTING
        // int -> long
        // =========================

        int a = 56;
        long b = a;

        System.out.println("a is: " + a);
        System.out.println("b is: " + b);


        // =========================
        // 3. CHAR EXAMPLE
        // =========================

        char grade = 'A';

        System.out.println("grade is: " + grade);
        System.out.println("After adding 2: " + (char)(grade + 2));


        // =========================
        // 4. EXPLICIT TYPE CASTING
        // long -> int
        // =========================

        long num1 = 23456757;
        int num2 = (int) num1;

        System.out.println("num1 is: " + num1);
        System.out.println("num2 is: " + num2);
    }
}