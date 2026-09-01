import java.util.Arrays;

public class EkoSpoj {

    // Check if we can collect required wood
    static boolean isPossible(int[] trees, int woodRequired, int height) {

        int totalWood = 0;

        for (int tree : trees) {

            if (tree > height) {
                totalWood = totalWood + (tree - height);
            }
        }

        return totalWood >= woodRequired;
    }


    static int ekoSpoj(int[] trees, int woodRequired) {

        if (trees == null || trees.length == 0 || woodRequired <= 0) {
            return -1;
        }

        int start = 0;

        // Maximum tree height
        int end = Arrays.stream(trees).max().getAsInt();

        int answer = 0;


        // Binary Search on Answer
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isPossible(trees, woodRequired, mid)) {

                answer = mid;

                // Try a higher cutting height
                start = mid + 1;
            }

            else {

                // Height is too high,
                // so cut lower
                end = mid - 1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        int[] trees = {20, 15, 10, 17};

        int woodRequired = 7;

        int result = ekoSpoj(trees, woodRequired);

        System.out.println(
            "Maximum height to cut the trees = " + result
        );
    }
}