public class EkoSpoj {
    static boolean isPossible(int[] trees, int woodRequired, int height) {
        int totalWood = 0;

        for (int tree : trees) {
            if (tree > height) {
                totalWood += (tree - height);
            }
        }

        return totalWood >= woodRequired;
    }

    static int ekoSpoj(int[] trees, int woodRequired) {
        if (trees == null || trees.length == 0 || woodRequired <= 0) {
            return -1;
        }

        int start = 0;
        int end = Arrays.stream(trees).max().getAsInt();
        int answer = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(trees, woodRequired, mid)) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] trees = {20, 15, 10, 17};
        int woodRequired = 7;

        System.out.println("Maximum height to cut the trees = " + ekoSpoj(trees, woodRequired));
    }
}