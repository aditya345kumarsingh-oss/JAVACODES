public class BSonAnswer {

    public double mysqrt(int x) {

        int s = 1;
        int e = x;
        double ans = -1;

        // Special case
        if (x == 0) {
            return 0;
        }

        // =========================
        // INTEGER PART
        // BINARY SEARCH
        // =========================
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (mid == x / mid) {
                ans = mid;
                break;
            }

            else if (mid > x / mid) {
                e = mid - 1; // move left
            }

            else {
                ans = mid;
                s = mid + 1; // move right
            }
        }


        // =========================
        // DECIMAL PART
        // =========================
        double factor = 1;
        int totalPrecision = 3;

        for (int round = 1; round <= totalPrecision; round++) {

            factor = factor / 10;

            for (int i = 1; i <= 10; i++) {

                double newAns = ans + factor;

                if (newAns * newAns == x) {
                    ans = newAns;
                    break;
                }

                else if (newAns * newAns < x) {
                    ans = newAns;
                }

                else {
                    break;
                }
            }

             System.out.printf("This round answer is: %.3f%n", ans);
                }

                  System.out.printf("Final answer is: %.3f%n", ans);
        return ans;
    }


    public static void main(String[] args) {

        int x = 56;

        BSonAnswer obj = new BSonAnswer();

        double result = obj.mysqrt(x);

        System.out.printf(
            "The square root of %d is: %.3f%n",
            x,
            result
        );
    }
}