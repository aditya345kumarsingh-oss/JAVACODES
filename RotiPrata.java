public class RotiPrata {

    // Check if p pratas can be made within 'mid' time
    static boolean isPossible(int[] cook, int n, int p, int mid) {

        int totalPratas = 0;

        // Check every cook
        for (int i = 0; i < n; i++) {

            int rank = cook[i];
            int time = 0;
            int prata = 1;

            // This cook makes pratas until time <= mid
            while (time + prata * rank <= mid) {

                time = time + prata * rank;

                totalPratas++;

                prata++;

                // We already made enough pratas
                if (totalPratas >= p) {
                    return true;
                }
            }
        }

        return false;
    }


    static int minTime(int[] cook, int n, int p) {

        // Find minimum rank (fastest cook)
        int minRank = cook[0];

        for (int i = 1; i < n; i++) {
            if (cook[i] < minRank) {
                minRank = cook[i];
            }
        }

        // Binary Search range
        int s = 0;

        // Maximum time:
        // fastest cook alone makes all p pratas
        int e = minRank * (p * (p + 1) / 2);

        int ans = -1;


        // Binary Search on Answer
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isPossible(cook, n, p, mid)) {

                ans = mid;

                // We want MINIMUM time
                e = mid - 1;
            }

            else {

                // Need more time
                s = mid + 1;
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        int[] cook = {1, 2, 3, 4};

        int n = cook.length;

        int p = 10;

        int result = minTime(cook, n, p);

        System.out.println(
            "Minimum time to make " + p + " pratas = " + result
        );
    }
}