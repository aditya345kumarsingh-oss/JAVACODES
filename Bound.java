public class Bound {
    //Lower bound 

    static int getLowerBound(int[] arr, int target) {

        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n;

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

    // Upper bound

    static int getUpperBound(int[] arr, int target) {

        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] <= target) {

                    
                s = mid + 1;    // Search in the right half

            } else {
                ans = mid;    // Store the possible answer

                e = mid - 1;    // Search in the left half
            }
        }

        return ans;
    }
    // Count Occurrences
    static int countOccurrence(int[] arr, int target) {
        return getUpperBound(arr, target) - getLowerBound(arr, target);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 30,40, 45 ,46,70};
         int targets = 30;
         int target = 25;


         int result = getLowerBound(arr, targets);
         int results = getUpperBound(arr, target);

        System.out.println("Lower Bound Index = " + result);    
        System.out.println("Upper Bound Index = " + results);
        int count = countOccurrence(arr, target);
        int counts = countOccurrence(arr, targets);

        
        System.out.println("Count of " + target + " = " + count);
        System.out.println("Count of " + targets + " = " + counts);
}
    }
