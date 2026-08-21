public class Nthroot {

    static int nthRoot(int n, int m) {

        int s = 1;
        int e = m;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            long value = 1;

            // calculate mid^n
            for (int i = 1; i <= n; i++) {
                value = value * mid;

                // avoid unnecessary large multiplication
                if (value > m) {
                    break;
                }
            }

            if (value == m) {
                return mid;
            }

            else if (value > m) {
                e = mid - 1;
            }

            else {
                s = mid + 1;
            }
        }

        // exact nth root does not exist
        return -1;
    }

    public static void main(String[] args) {

        int n = 8;
        int m = 64;

        int result = nthRoot(n, m);

        if (result == -1) {
            System.out.println("Exact nth root does not exist");
        } else {
            System.out.println(
                n + "th root of " + m + " is: " + result
            );
        }
    }
}