//public class math {
                 //printing the digits of a number
//    static void printdigits(int num){
//        while(num!=0){
//            int digit =num%10;
//            System .out.println(digit);
//            num=num/10;
//        }
//    }
                //   count digits of a number
//    static int countdigits(int num){
//        int count=0;
//       while(num!=0){
//            int digit =num%10;
//            count++;
//            num=num/10;
//        }
//        return count;
//    }
    //sum of a digits
//    static int sumdigits(int num){
//        int sum=0;
//        while(num!=0){
//            int digit =num%10;
//           sum=sum+digit;
//            num=num/10;
//        }
//        return sum;
//    }

    //reverse number
//    static int reversedigits(int num){
//       int rev=0;
//       while(num!=0){
//            int digit =num%10;
//           rev=rev*10+digit;
//            num=num/10;
//        }
//       return rev;
//    }
    // public static void main(){
//        int num =53127;
//        int rev= reversedigits(num);
//        System.out.println(rev);
//       int sum=sumdigits(num);
//        System.out.println(sum);
//        int ans=countdigits(num);
//        System.out.println(ans);
//        printdigits(num) ;
//


//public class math {
//    //Palindrom number
//    static int reversedigits(int num) {
//        int rev = 0;
//        while (num != 0) {
//            int digit = num % 10;
//            rev = rev * 10 + digit;
//            num = num / 10;
//        }
//        return rev;
//    }
//
//    static boolean ispalindrom(int num) {
//        int originalNum = num;
//        int reversedigits = reversedigits(num);
//        if (originalNum == reversedigits) {
//            System.out.println("palindrom");
//            return true;
//        } else {
//            System.out.println("not a palindrom");
//            return false;
//        }
//    }

//    public static void main() {
//        boolean ans = ispalindrom(1221);
//        System.out.println(ans);
//    }
//}

//prime number
public class math {
//    static boolean isPrime(int num) {
//        for (int i = 2; i * i <= num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
    // GCD NUMBER
    static int getgcd(int a , int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int ans=a;
        return ans;
    }
    // LCM NUMBER
//    static int getlcm(int a, int b){
//        int gcd= getgcd(a, b);
//        int prod= a*b;
//        int lcm = prod/ gcd;
//        return lcm ;
//    }
    static  boolean isarmstron(int num){
        int sum =0;
        int org=num;
        while (num!=0){
            int digit=num%10;
            int cube = digit*digit*digit;
            sum= sum+cube;
            num=num/10;

        }
        if ( sum == org){
            return true;
        }
        else {
            return  false;
        }

    }
    // perfect number
    static boolean perfect(int num){
        int sum=1;
        for (int i=2; i*i<=num;i++){
        if(num %i==0){
            int first=i;
            int second =num/i;
            sum=sum+first+second;
        }
    }
   if ( sum == num){
        return true;
    }
        else {
        return  false;
    }

}

    public static void main(String[] args) {
        System.out.println(perfect(6 ));
//        System.out.println(isarmstron(153));
//        System.out.println(getlcm(10 , 20));
//        int num = 21;
//        System.out.println(isPrime(num));
    }
}
    

