public class Mountainarray {
    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak is in the right half
                left = mid + 1;
            } else {
                // Peak is in the left half or at mid
                right = mid;
            }
        }

        return left; // or right, both are the same at this point
    }

    public static void main(String[] args) {
        int[] arr = {10, 20,30, 40,50, 60, 70, 25};
        int peakIndex = findPeak(arr);
        System.out.println("Peak element is at index: " + peakIndex + ", value: " + arr[peakIndex]);
    }
    
}
