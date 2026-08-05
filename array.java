import java.util.Scanner;

public class array{
    public static void main(String[] args) {

        
        // 1. DECLARING AND INITIALIZING ARRAY
      
        int[] arr = new int[5];
        int[] brr = {2, 32, 4, 5, 6};

        System.out.println("Element at index 3: " + brr[3]);

        System.out.println("\nPrinting array using for loop:");
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }

        System.out.println("\nPrinting array using for-each loop:");
        for (int a : brr) {
            System.out.println(a);
        }

        
        // 2. TAKING ARRAY INPUT FROM USER
        
        Scanner sc = new Scanner(System.in);

        int[] inputArr = new int[5];

        for (int i = 0; i < inputArr.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            inputArr[i] = sc.nextInt();
        }

        System.out.println("Values in the array:");
        for (int a : inputArr) {
            System.out.print(a + " ");
        }
        System.out.println();

       
        // 3. SUM OF ARRAY
       
        int[] arr1 = {2, 3, 4, 10, 1};

        int sum = 0;
        for (int a : arr1) {
            sum += a;
        }

        System.out.println("\nSum of array = " + sum);

        
        // 4. MULTIPLICATION OF ARRAY
        
        int product = 1;

        for (int a : arr1) {
            product *= a;
        }

        System.out.println("Product of array = " + product);

       
        // 5. MAXIMUM AND MINIMUM IN ARRAY
        
        int max = arr1[0];
        int min = arr1[0];

        for (int i = 1; i < arr1.length; i++) {

            if (arr1[i] > max) {
                max = arr1[i];
            }

            if (arr1[i] < min) {
                min = arr1[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

       
        // 6. 2D ARRAY
       
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println("\nElement at [1][0] = " + matrix[1][0]);

        System.out.println("\nPrinting 2D Array:");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

       
    }}