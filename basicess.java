public class basicess {
    public static void main(String[] args) {

        // 1. EVEN OR ODD
       
        int num = 15;

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        // 2. GREATER OF TWO NUMBERS
        int a = 20;
        int b = 30;

        if (a > b) {
            System.out.println(a + " is Greater");
        } else {
            System.out.println(b + " is Greater");
        }
        // 3. SUM FROM 1 TO N
        
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);

        // 4. FACTORIAL
       
        int number = 5;
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);

        // 5. REVERSE A NUMBER
    
        int value = 1234;
        int temp = value;
        int reverse = 0;

        while (temp != 0) {

            int digit = temp % 10;

            reverse = reverse * 10 + digit;

            temp = temp / 10;
        }

        System.out.println("Reverse of " + value + " = " + reverse);


      
        // 6. PALINDROME NUMBER
        int palindromeNum = 1221;
        int original = palindromeNum;
        int rev = 0;

        while (palindromeNum != 0) {

            int digit = palindromeNum % 10;

            rev = rev * 10 + digit;

            palindromeNum = palindromeNum / 10;
        }

        if (original == rev) {
            System.out.println(original + " is Palindrome");
        } else {
            System.out.println(original + " is Not Palindrome");
        }
        // 7. PRIME NUMBER
        int primeNum = 17;
        boolean prime = true;

        if (primeNum <= 1) {
            prime = false;
        }

        for (int i = 2; i * i <= primeNum; i++) {

            if (primeNum % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(primeNum + " is Prime");
        } else {
            System.out.println(primeNum + " is Not Prime");
        }


      
        // 8. FIBONACCI SERIES
       
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci: ");

        for (int i = 1; i <= 10; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }

        System.out.println();


        
        // 9. MULTIPLICATION TABLE
       
        int table = 5;

        System.out.println("Table of " + table);

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                table + " x " + i + " = " + (table * i)
            );
        }

        // 10. COUNT DIGITS
    
        int countNum = 53127;
        int count = 0;
        int copy = countNum;

        while (copy != 0) {
            count++;
            copy = copy / 10;
        }

        System.out.println(
            "Number of digits in " + countNum + " = " + count
        );

        // 11. SUM OF DIGITS
       
        int sumNum = 1234;
        int digitSum = 0;
        int copy2 = sumNum;

        while (copy2 != 0) {

            int digit = copy2 % 10;

            digitSum = digitSum + digit;

            copy2 = copy2 / 10;
        }

        System.out.println(
            "Sum of digits of " + sumNum + " = " + digitSum
        );
    }
}
    

