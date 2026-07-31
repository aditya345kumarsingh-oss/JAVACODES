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


 // Q4 Transpose of Matrix
     
    public static int[][] transpose(int[][] matrixx) {

        //  matrix is null or empty
        if (matrixx == null || matrixx.length == 0) {
            return new int[0][0];
        }

        // Original matrix dimensions
        int totalRows = matrixx.length;
        int totalCols = matrixx[0].length;

        // Transposed matrix dimensions
        int newTotalRows = totalCols;
        int newTotalCols = totalRows;

        // Create new transpose matrix
        int[][] ans = new int[newTotalRows][newTotalCols];

        // Fill transpose matrix
        for (int i = 0; i < totalRows; i++) {

            for (int j = 0; j < totalCols; j++) {

                ans[j][i] = matrixx[i][j];

            }
        }

        return ans;
    }

    // Q5 rotate image 
     public static void rotate(int[][] matries, int N){
        //transpose first
        //swap matrix

        for(int i=0; i<N ; i++){
            for (int j=i+1; j<N ; j++){
                //swap matrix[i][j]= matrix [i][j]
                int temp= matries[i][j];
                 matries [i][j] =  matries [j][i];
                 matries [j][i] = temp;


            }
        }
        //reverse all row 
        for(int row=0; row<N; row++){
            int startcol=0;
            int endcol=N-1;
            while(startcol<endcol){
               int temp = matries[row][startcol];
               matries[row][startcol] = matries[row][endcol];
               matries[row][endcol] = temp;
                startcol++;
                endcol--;
            }
        }
    }
//Q6 Spiral print a matrix 
     static List<Integer> spiral(int[][] matriess) {

    int m = matriess.length;
    int n = matriess[0].length;

    List<Integer> res = new ArrayList<>();

    int startingrow = 0;
    int endingrow = m - 1;

    int startingcol = 0;
    int endingcol = n - 1;

    while (startingrow <= endingrow && startingcol <= endingcol) {

        // Left to Right
        for (int col = startingcol; col <= endingcol; col++) {
            res.add(matriess[startingrow][col]);
        }
        startingrow++;

        // Top to Bottom
        for (int row = startingrow; row <= endingrow; row++) {
            res.add(matriess[row][endingcol]);
        }
        endingcol--;

        // Right to Left
        if (startingrow <= endingrow) {

            for (int col = endingcol; col >= startingcol; col--) {
                res.add(matriess[endingrow][col]);
            }

            endingrow--;
        }

        // Bottom to Top
        if (startingcol <= endingcol) {

            for (int row = endingrow; row >= startingrow; row--) {
                res.add(matriess[row][startingcol]);
            }

            startingcol++;
        }
    }

    return res;
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

//Q4 part 
int[][] matrixx = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Call transpose function
        int[][] results = transpose(matrixx);

        System.out.println("Original Matrix:");

        for (int i = 0; i < matrixx.length; i++) {

            for (int j = 0; j < matrixx[0].length; j++) {

                System.out.print(matrixx[i][j] + " ");

            }

            System.out.println();
        }

        System.out.println();

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < results.length; i++) {

            for (int j = 0; j < results[0].length; j++) {

                System.out.print(results[i][j] + " ");

            }

            System.out.println();
        }

           // Q5 starts here
int[][] matries = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
};

rotate(matries, 3);

System.out.println("Rotated Matrix:");

for (int i = 0; i < matries.length; i++) {

    for (int j = 0; j < matries[0].length; j++) {
        System.out.print(matries[i][j] + " ");
    }

    System.out.println();

    //Q6 part 
    int[][] matriess = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
};

List<Integer> res = spiral(matriess);

System.out.println(res);
}
}
}