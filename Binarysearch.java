public class Binarysearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
       

        while (left <= right) {
            int mid = left + (right - left) / 2;
            

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid; // Target found
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else { // If target is smaller, ignore the right half
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40, 50};
        int target = 50;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
    
}
