public class bitwiseoperator {
    public static void main(String[] args) {
        int a= 5;
        int b= 6;
        
        //and operation
        System.out.println(a&b);

        // or operation
        System.out.println(a|b);

        // xor operation
       System.out.println(a^b);

        // not operation
        System.out.println(~a);

        // left shift-- operation in this we multiply by 2
        int n=5;
        for(int i=1 ; i<=34 ; i++){
        n=n<<1;
        System.out.println(n);
        System.out.println();
        }

        // right shift -- in this we divide by 2
        int m=100;
        for(int i=1 ; i<=10 ; i++){
        n=n<<1;
        System.out.println(n);
        System.out.println();
        }



   }
    
}
