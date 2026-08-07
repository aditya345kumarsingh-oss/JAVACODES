public class math {

    // Print digits of a number
    static void printDigits(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }

    // Count digits of a number
    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // Sum of digits
    static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }

    // Reverse a number
    static int reverseDigits(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }

    // Palindrome number
    static boolean isPalindrome(int num) {
        return num == reverseDigits(num);
    }

    // Prime number
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // GCD (Euclidean Algorithm)
    static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM
    static int getLCM(int a, int b) {
        int gcd = getGCD(a, b);
        return (a * b) / gcd;
    }

    // Armstrong Number (3-digit)
    static boolean isArmstrong(int num) {
        int sum = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        return sum == original;
    }

    // Perfect Number
    static boolean perfect(int num) {

        if (num <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;

                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {

        int num = 53127;

        System.out.println("Digits:");
        printDigits(num);

        System.out.println("\nCount of Digits: " + countDigits(num));
        System.out.println("Sum of Digits: " + sumDigits(num));
        System.out.println("Reverse: " + reverseDigits(num));

        System.out.println("\nPalindrome (1221): " + isPalindrome(1221));
        System.out.println("Prime (21): " + isPrime(21));

        System.out.println("\nGCD of 10 and 20: " + getGCD(10, 20));
        System.out.println("LCM of 10 and 20: " + getLCM(10, 20));

        System.out.println("\nArmstrong (153): " + isArmstrong(153));
        System.out.println("Perfect Number (6): " + perfect(6));
    }
}