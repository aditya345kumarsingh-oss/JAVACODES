public class LowerBound {

    static int getLowerBound(int[] arr, int target) {

        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] >= target) {

                ans = mid;      // Store the possible answer
                e = mid - 1;    // Search in the left half

            } else {

                s = mid + 1;    // Search in the right half
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 30, 30, 40, 45};
        int target = 30;

        int result = getLowerBound(arr, target);

        System.out.println("Lower Bound Index = " + result);
    }
}