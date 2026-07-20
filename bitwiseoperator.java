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
        System.out.println(m);
        System.out.println();
        }

        //question 
        //Q1. check odd and even no
        //for example -> 1--00000001 , 2--00000010
        //for this example we can se that for odd RMB is 1 and for even RMB is 0

        int c=10;
        if ((c&1)==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }


        //Q2.check the power of 2
        //in power of 2 there will be 1 set bit for ex-->16= 00010000

        int d=16;
        if ((d&(d-1))==0) {
           System.out.println("power of 2");
            
        } else {
            System.out.println("not a power of 2");

            
        }


       //Q3. swap two number  using XOR
        int e= 10;
        int f = 20;

        System.out.println("Before Swapping:");
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        e = e ^ f;
        f = e ^ f;
        e = e ^ f;

        System.out.println("After Swapping:");
        System.out.println("e = " + e);
        System.out.println("f = " + f);


        // find unique element all other appear twice--xor method
        //a ^ a = 0
        //a ^ 0 = a

         int[] arr = {2, 4, 5, 2, 4, 5, 7};

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }

        System.out.println("Unique element is: " + ans);


        // for removing the last set bit
        int g=10;
        System.out.println((g&(g-1)));
    
    // get last set bit

     int h = 10;

        int lastSetBit = h & -h;

        System.out.println("Last set bit = " + lastSetBit);
    }
}

    

