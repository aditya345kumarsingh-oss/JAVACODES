//  import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//            int arr[];
//          arr = new int[5];
//          int brr[]= {2,32,4,5,6};
//        // checking the length of array
//          System.out.println(brr[3]);
//          int n=brr.length;
//         // loop
//          for (int i=0;i<brr.length;i++){
//              System.out.println(brr[i]);
//          }}}
        
// //for each loop
//     for (int a:brr){
//         System.out.println(a);
//     }

//    // taking input from user

//     int arr[]=new int [5];
//     Scanner sc=new Scanner(System.in);
//     int n=arr.length;
//     for (int i=0;i<=n-1;i++){
//         System.out.println("Enter the value of index "+i);
//         arr[i]=sc.nextInt();
//     }
//     System.out.println("The values in the array are: ");
//     for (int a:arr){
//         System.out.println(a);
//     }

//    // adding the array

//      int arr[]={2,3,4,10,1};
//          int sum=0;
//         for each method
//         for (int a:arr){
//             sum=sum+a;
//         }
//         System.out.println("The sum of the array is: "+sum);
//         only for loop
//         int n=arr.length;
//         for (int i=0;i<=n-1;i++){
//             int a=arr[i];
//             sum=sum+a;
//         }
//         System.out.println("The sum of the array is: "+sum);
        
//         multiplying the array
//         int b=1;
//         int n=arr.length;
//         for (int i=0;i<=n-1;i++){
//             int a=arr[i];
//             b=b*a;
//         }
//         System.out.println("The multiplication of the array is: "+b);
// find the maximum and minimum value in the array
//         int max=arr[0];
//         int min=arr[0];
//         int n=arr.length;
//         for (int i=0;i<=n-1;i++){
//             if (arr[i]>max){
//                 max=arr[i];
//             }
//             if (arr[i]<min){
//                 min=arr[i];
//             }
//         }
//         System.out.println("The maximum value in the array is: "+max);
//         System.out.println("The minimum value in the array is: "+min);



//       2D array
//         int arr[][];//declaring 2D array
//         arr = new int[3][4];//allocating memory for 2D array
//         int[][] brr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};// initializing 2D array
//         System.out.println(brr[1][0]);//accessing 2D array

//        printing the whole row and column of 2D array
//         int n = brr.length;
//         int m = brr[0].length;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(brr[i][j] + " ");
//             }
//             System.out.println();
//         }

//         jagged array
//          int[][] brr = {{1, 2, 3, }, {5, 6, }, {9, 10, 11, 12}};

//         int rowLength = brr.length;

//         // Traverse each row
//         for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {

//             // Number of columns in the current row
//             int colLength = brr[rowIndex].length;

//             // Traverse each column
//             for (int colIndex = 0; colIndex < colLength; colIndex++) {
//                 System.out.print(brr[rowIndex][colIndex] + " ");
//             }

//             // Move to the next line after each row
//             System.out.println();
//         }

//  shorter way to print the jagged array      
//  for (int rowIndex = 0; rowIndex <=brr.length-1; rowIndex++) {

//             for (int colIndex = 0; colIndex <= brr[rowIndex].length-1; colIndex++) {

//                 System.out.print(brr[rowIndex][colIndex] + " ");
//             }

//             System.out.println();
//         }

// 2d input from user
// int arr[][];
// arr=new int [3][4];
// Scanner sc=new Scanner(System.in);
// for (int i=0;i<=arr.length-1;i++){
//     for (int j=0;j<=arr[i].length-1;j++){
//         System.out.println("provide value for row "+i+" column "+j);
//         arr[i][j]=sc.nextInt();
       
//     }
// } 
// for (int rowIndex = 0; rowIndex <=arr.length-1; rowIndex++) {

//            for (int colIndex = 0; colIndex <= arr[rowIndex].length-1; colIndex++) {
//                  System.out.print(arr[rowIndex][colIndex] + " ");
//           }

//             System.out.println();
//         }
//     }} 

// sum for 2d array
// int arr[][]={{1,2,3},{4,5,6},};
// int sum=0;
// for (int rowIndex = 0; rowIndex <=arr.length-1; rowIndex++) {

//            for (int colIndex = 0; colIndex <= arr[rowIndex].length-1; colIndex++) {
//                  sum=sum+arr[rowIndex][colIndex];
//           }
//         }
//         System.out.println("The sum of the 2D array is: "+sum);
//     }}  

//     multiplication of 2D array
//     int ans=1;
//    for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr[i].length; j++) {
//                 int a=arr[i][j];
//             ans = a*ans;
//         }
//     }
//     System.out.println(ans);
// }}

// max and min of 2D array
// int max=arr[0][0];
// int min=arr[0][0];
// for (int i = 0; i < arr.length; i++) {
//     for (int j = 0; j < arr[i].length; j++) {
//         if (arr[i][j]>max){
//             max=arr[i][j];
//         }
//         if (arr[i][j]<min){
//             min=arr[i][j];
//         }
//     }
// }
// System.out.println("The maximum value in the 2D array is: "+max);
// System.out.println("The minimum value in the 2D array is: "+min);

//         }
//         }
