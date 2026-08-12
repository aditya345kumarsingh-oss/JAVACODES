import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        // =====================================================
        // 1. INPUT IN JAVA
        // =====================================================

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        int first = sc.nextInt();

        System.out.println("Enter the second value: ");
        int second = sc.nextInt();

        int sum = first + second;

        System.out.println("The sum is: " + sum);


        // =====================================================
        // 2. IF STATEMENT
        // =====================================================

        int age = 19;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }


        // =====================================================
        // 3. IF ELSE STATEMENT
        // =====================================================

        int agee = 10;

        if (agee >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }


        // =====================================================
        // 4. IF ELSE IF LADDER
        // =====================================================

        int day = 3;

        if (day == 1) {
            System.out.println("Monday");

        } else if (day == 2) {
            System.out.println("Tuesday");

        } else if (day == 3) {
            System.out.println("Wednesday");

        } else {
            System.out.println("Invalid day");
        }


        // =====================================================
        // 5. NESTED IF ELSE
        // =====================================================

        int ages = 20;
        char gender = 'M';

        if (gender == 'M') {

            System.out.println("You are a male.");

            if (ages > 18) {
                System.out.println("You are a male and age > 18.");
            } else {
                System.out.println("You are a male and age <= 18.");
            }

        } else {

            System.out.println("You are not a male.");

            if (ages > 18) {
                System.out.println("You are not a male and age > 18.");
            } else {
                System.out.println("You are not a male and age <= 18.");
            }
        }


        // =====================================================
        // 6. TERNARY OPERATOR
        // =====================================================

        int heroAge = 20;

        int isHero = (heroAge == 23) ? 1 : 0;

        System.out.println("isHero = " + isHero);


        // =====================================================
        // BETTER TERNARY EXAMPLE
        // =====================================================

        int votingAge = 20;

        String result = (votingAge >= 18)
                ? "Eligible to vote"
                : "Not eligible to vote";

        System.out.println(result);


        // =====================================================
        // 7. SWITCH CASE
        // =====================================================

        int switchDay = 3;

        switch (switchDay) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }

        sc.close();
    }
}