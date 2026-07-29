import java.util.HashSet;
 
public class array5 {


    // Missing element from an array with duplicates no.

    static void missing(int[] arr, int n) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,4,6,6,8};

        missing(arr, 8);
    }
}