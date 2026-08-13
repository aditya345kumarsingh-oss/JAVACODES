import java.util.Scanner;

public class code {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();


        // 1. Print counting from 1 to n
        for (int i = 1; i <= limit; i++) {
            System.out.println("The value of i is: " + i);
        }


        // 2. Print counting from n to 1
        for (int i = limit; i >= 1; i--) {
            System.out.println("The value of i is: " + i);
        }


        // 3. Print the first 10 multiples of n
        for (int i = 1; i <= 10; i++) {
            System.out.println(limit * i);
        }


        // 4. Print name n times
        for (int i = 1; i <= limit; i++) {
            System.out.println("Aditya");
        }


        sc.close();
    }
}