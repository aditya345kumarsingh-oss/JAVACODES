public class basics {

    public static void main(String[] args) {

        // =========================
        // 1. VARIABLES
        // =========================
        int age = 20;
        double height = 5.10;
        char grade = 'A';
        boolean student = true;
        String name = "Aditya";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + student);


        // =========================
        // 2. ARITHMETIC OPERATORS
        // =========================
        int a = 20;
        int b = 6;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));


        // =========================
        // 3. INT TO DOUBLE
        // Widening / Implicit Casting
        // =========================
        int num = 50;
        double value = num;

        System.out.println("Integer: " + num);
        System.out.println("Double: " + value);


        // =========================
        // 4. DOUBLE TO INT
        // Narrowing / Explicit Casting
        // =========================
        double price = 99.99;
        int newPrice = (int) price;

        System.out.println("Original Price: " + price);
        System.out.println("After Casting: " + newPrice);


        // =========================
        // 5. CHAR TO INT
        // =========================
        char ch = 'A';
        int ascii = ch;

        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + ascii);


        // =========================
        // 6. INT TO CHAR
        // =========================
        int number = 66;
        char character = (char) number;

        System.out.println("Number: " + number);
        System.out.println("Character: " + character);


        // =========================
        // 7. INCREMENT / DECREMENT
        // =========================
        int x = 10;

        x++;
        System.out.println("After Increment: " + x);

        x--;
        System.out.println("After Decrement: " + x);


        // =========================
        // 8. RELATIONAL OPERATORS
        // =========================
        int p = 10;
        int q = 20;

        System.out.println(p > q);
        System.out.println(p < q);
        System.out.println(p == q);
        System.out.println(p != q);


        // =========================
        // 9. SIMPLE IF-ELSE
        // =========================
        int marks = 75;

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        // =========================
        // 10. EVEN OR ODD
        // =========================
        int n = 17;

        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
}