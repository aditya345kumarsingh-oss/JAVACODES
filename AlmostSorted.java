public class AlmostSorted {

    public int findElementInAlmostSortedArray(int[] arr, int k) {

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            // Check middle
            if (arr[mid] == k) {
                return mid;
            }

            // Check left of mid
            if (mid - 1 >= s && arr[mid - 1] == k) {
                return mid - 1;
            }

            // Check right of mid
            if (mid + 1 <= e && arr[mid + 1] == k) {
                return mid + 1;
            }

            // Move right
            if (k > arr[mid]) {
                s = mid + 2;
            }

            // Move left
            else {
                e = mid - 2;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        AlmostSorted almostSorted = new AlmostSorted();

        int[] arr = {10, 3, 40, 20, 50, 80, 70};

        int k = 40;

        int index =
            almostSorted.findElementInAlmostSortedArray(arr, k);

        if (index != -1) {
            System.out.println(
                "Element " + k + " found at index: " + index
            );
        } else {
            System.out.println(
                "Element " + k + " not found in the array."
            );
        }
    }
}