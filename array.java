import java.util.Scanner;

public class array{
    public static void main(String[] args) {

        
        // 1. DECLARING AND INITIALIZING ARRAY
      
        int[] arr = new int[5];
        int[] brr = {2, 32, 4, 5, 6};

        System.out.println("Element at index 3: " + brr[3]);

        System.out.println("\nPrinting array using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
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

       
     //7. JAGGED ARRAY
       
        int[][] jagged = {
                {1, 2, 3},
                {5, 6},
                {9, 10, 11, 12}
        };

        System.out.println("\nJagged Array:");

        for (int i = 0; i < jagged.length; i++) {

            for (int j = 0; j < jagged[i].length; j++) {

                System.out.print(jagged[i][j] + " ");
            }

            System.out.println();
        }

        
        // 8. 2D ARRAY INPUT
        
        int[][] userMatrix = new int[3][4];

        System.out.println("\nEnter values for 2D array:");

        for (int i = 0; i < userMatrix.length; i++) {

            for (int j = 0; j < userMatrix[i].length; j++) {

                System.out.print("Row " + i + " Column " + j + ": ");
                userMatrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n2D Array:");

        for (int i = 0; i < userMatrix.length; i++) {

            for (int j = 0; j < userMatrix[i].length; j++) {

                System.out.print(userMatrix[i][j] + " ");
            }

            System.out.println();
        }

       
        // 9. SUM OF 2D ARRAY
       
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int sum2 = 0;

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {

                sum2 += arr2[i][j];
            }
        }

        System.out.println("\nSum of 2D array = " + sum2);

       
        // 10. PRODUCT OF 2D ARRAY
        
        int ans = 1;

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {

                ans *= arr2[i][j];
            }
        }

        System.out.println("Product of 2D array = " + ans);

        
        // 11. MAXIMUM AND MINIMUM OF 2D ARRAY
       
        int max2 = arr2[0][0];
        int min2 = arr2[0][0];

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {

                if (arr2[i][j] > max2)
                    max2 = arr2[i][j];

                if (arr2[i][j] < min2)
                    min2 = arr2[i][j];
            }
        }

        System.out.println("Maximum = " + max2);
        System.out.println("Minimum = " + min2);

        sc.close();
    }
}