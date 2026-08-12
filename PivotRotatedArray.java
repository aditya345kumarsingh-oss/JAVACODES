public class PivotRotatedArray {

    public static int findPivotIndex(int[] nums) {

        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        // No effective rotation
        if (nums[s] < nums[e]) {
            return -1;
        }

        // Binary search logic
        while (s <= e) {

            int mid = s + (e - s) / 2;

            // mid is on the right sorted part
            if (nums[mid] <= nums[n - 1]) {

                ans = mid;

                // Move left to find the first element
                // of the right sorted part
                e = mid - 1;

            } else {

                // mid is on the left sorted part
                // Move right
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {50, 60,70, 10, 20, 30 , 40 };

        int pivot = findPivotIndex(nums);

        System.out.println("Pivot Index: " + pivot);

        if (pivot != -1) {
            System.out.println("Pivot Element: " + nums[pivot]);
        }
    }
}