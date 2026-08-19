public class AllocateBooks {

    // Check if allocation is possible
    static boolean isPossible(int[] books, int students, int maxPages) {

        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < books.length; i++) {

            // One book itself is greater than allowed pages
            if (books[i] > maxPages) {
                return false;
            }

            // Give book to current student
            if (pages + books[i] <= maxPages) {

                pages = pages + books[i];
            }

            // Give book to next student
            else {

                studentCount++;

                pages = books[i];

                // Too many students required
                if (studentCount > students) {
                    return false;
                }
            }
        }

        return true;
    }


    static int allocateBooks(int[] books, int students) {

        // More students than books
        if (students > books.length) {
            return -1;
        }

        int s = 0;
        int e = 0;
        int ans = -1;

        // Find total pages
        for (int i = 0; i < books.length; i++) {
            e = e + books[i];
        }


        // Binary Search on Answer
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isPossible(books, students, mid)) {

                ans = mid;

                // Try to find smaller answer
                e = mid - 1;
            }

            else {

                // Need to allow more pages
                s = mid + 1;
            }
        }

        return ans;
    }
 public static void main(String[] args) {

        int[] books = {10, 20, 30, 40};

        int students = 2;

        int result = allocateBooks(books, students);

        System.out.println(
            "Minimum maximum pages = " + result
        );
    }
}

   
