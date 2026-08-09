public class pattern {

    public static void main(String[] args) {

        // =========================
        // 1. SOLID SQUARE PATTERN
        // =========================
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // =========================
        // 2. RECTANGLE PATTERN
        // =========================
        int m = 3;

        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // =========================
        // 3. RIGHT ANGLE TRIANGLE
        // =========================
        n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // =========================
        // 4. RHOMBUS PATTERN
        // =========================
        n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // =========================
        // 5. INVERTED RIGHT TRIANGLE
        // =========================
        n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // =========================
        // 6. PYRAMID PATTERN
        // =========================
        n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // =========================
        // 7. INVERTED PYRAMID
        // =========================
        n = 4;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // =========================
        // 8. HOLLOW RECTANGLE
        // =========================
        n = 4;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= 6; col++) {

                if (row == 1 || row == n || col == 1 || col == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }


        // =========================
        // 9. HOLLOW RIGHT TRIANGLE
        // =========================
        n = 5;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                if (row == 1 || row == n || col == 1 || col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }


        // =========================
        // 10. HOLLOW PYRAMID
        // =========================
        n = 5;

        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Stars
            for (int col = 1; col <= 2 * row - 1; col++) {

                if (row == n || col == 1 || col == 2 * row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}