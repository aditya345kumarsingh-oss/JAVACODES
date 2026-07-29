import java.util.ArrayList;
import java.util.List;

public class array2d {
    //sum of each row in a 2D array
    // Function to find sum of each row
    static List<Integer> rowSums(int[][] arr) {

        List<Integer> result = new ArrayList<>();

        int m = arr.length;        // Number of rows
        int n = arr[0].length;     // Number of columns

        // Traverse each row
        for (int row = 0; row < m; row++) {

            int sum = 0;   // Reset sum for every new row

            // Traverse each column
            for (int col = 0; col < n; col++) {

                int value = arr[row][col];
                sum = sum + value;

            }

            // Store the row sum
            result.add(sum);
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> ans = rowSums(arr);

        System.out.println("Row Sums: " + ans);
    }
}
    

