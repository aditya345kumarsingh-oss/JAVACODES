public class loops {
    public static void main(String[] args) {

        // =========================
        // FOR LOOP - EXAMPLE 1
        // =========================
        for (int i = 1; i <= 5; i++) {
            System.out.println("The value of i is: " + i);
        }

        System.out.println();

        // =========================
        // FOR LOOP - EXAMPLE 2
        // =========================
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("The value of i is: " + i);
        }

        System.out.println();

        // =========================
        // NESTED FOR LOOP - EXAMPLE 1
        // =========================
        for (int i = 1; i <= 3; i++) { // Rows
            for (int j = 1; j <= 3; j++) { // Columns
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // =========================
        // NESTED FOR LOOP - EXAMPLE 2
        // =========================
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println();

        // =========================
        // BREAK STATEMENT
        // =========================
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("The value of i is: " + i);
        }

        System.out.println();

        // =========================
        // CONTINUE STATEMENT
        // =========================
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("The value of i is: " + i);
        }

        System.out.println();

        // =========================
        // WHILE LOOP - EXAMPLE 1
        // =========================
        int i = 1;
        while (i <= 5) {
            System.out.println("The value of i is: " + i);
            i++;
        }

        System.out.println();

        // =========================
        // NESTED WHILE LOOP
        // =========================
        i = 1;
        while (i <= 2) {
            int j = 1;
            while (j <= 3) {
                System.out.println("i = " + i + ", j = " + j);
                j++;
            }
            i++;
        }

        System.out.println();

        // =========================
        // DO-WHILE LOOP
        // =========================
        i = 1;
        do {
            System.out.println("The value of i is: " + i);
            i++;
        } while (i <= 5);
    }
}