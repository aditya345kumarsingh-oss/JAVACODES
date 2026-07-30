import java.util.ArrayList;
import java.util.List;

public class array2d {
    //Q1
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

    //Q2
    //for column
     static List<Integer> columnSums(int[][] brr) {

        List<Integer> result = new ArrayList<>();

        int rows = brr.length;
        int cols = brr[0].length;

        // Traverse each column
        for (int col = 0; col < cols; col++) {

            int sum = 0;

            // Traverse each row
            for (int row = 0; row < rows; row++) {

                sum = sum + brr[row][col];
            }

            result.add(sum);
        }

        return result;
    }

    // Q3 Wave Print Matrix
static List<Integer> waveMatrix(int[][] matrix, int m, int n) {

    List<Integer> result = new ArrayList<>();

    // Move column wise
    for (int col = 0; col < n; col++) {

        // Odd column -> Bottom to Top
        if ((col & 1) == 1) {

            for (int row = m - 1; row >= 0; row--) {
                result.add(matrix[row][col]);
            }

        } else {

            // Even column -> Top to Bottom
            for (int row = 0; row < m; row++) {
                result.add(matrix[row][col]);
            }
        }
    }

    return result;
}
    

    public static void main(String[] args) {
        //Q1 part

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> ans = rowSums(arr);

        System.out.println("Row Sums: " + ans);

        //Q2 part
          int[][] brr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> anss = columnSums(brr);

        System.out.println("Column Sums: " + anss);

        // Q3 part 
  int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

List<Integer> result = waveMatrix(matrix, 3, 3);

System.out.println(result);
    }
}
