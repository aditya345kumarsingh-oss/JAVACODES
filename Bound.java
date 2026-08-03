public class Bound {

    
    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; // Returns the index of the first element not less than target
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4,5,10,10,10, 10, 40};
        int target = 35;
        int result = lowerBound(arr, target);
        System.out.println("Lower bound index for " + target + " is: " + result);
    }
    
}
