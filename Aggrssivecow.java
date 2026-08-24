import java.util.Arrays;

public class Aggrssivecow {

    static boolean isPossible(int[] stalls, int cows, int minimumDistance) {
        int placedCows = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= minimumDistance) {
                placedCows++;
                lastPosition = stalls[i];

                if (placedCows >= cows) {
                    return true;
                }
            }
        }

        return false;
    }

    static int aggressiveCows(int[] stalls, int cows) {
        if (stalls == null || stalls.length == 0 || cows <= 0 || cows > stalls.length) {
            return -1;
        }

        Arrays.sort(stalls);

        int start = 0;
        int end = stalls[stalls.length - 1] - stalls[0];
        int answer = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(stalls, cows, mid)) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] stalls = {4, 2, 1, 3, 6};
        int cows = 2;

        System.out.println("Maximum minimum distance = " + aggressiveCows(stalls, cows));
    }
}
