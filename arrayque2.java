public class arrayque2 {

    //Q1.Reverse an array---using 2pointer
    static void reverse(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while (i<=j) {
            int temp=arr[i]; //swaping the array
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        for (int k : arr) {
            System.out.println(k);
            
        }


    }

    //Q2. Shift array  element bt 1 position 

    static void shift(int brr[]){
        int m=brr.length;
        int temp = brr[m-1];

        for(int i=m-1 ;i>0 ; i--){
     brr[i]= brr[i-1];
    }
    brr[0]=temp;
}

//Q3. Print extreme element in an alternate manner
      static void alt(int crr[]){
        int a= crr.length;
        int i=0;
        int j=a-1;
        while (i<=j) {
            if (i==j){
                System.out.println(crr[i]);
                return;

            }
            else{
                System.out.println(crr[i]);
                i++;
                System.out.println(crr[j]);
                j--;

            }
            
        }
      }
    public static void main(String[] args) {

        //Q1 part 
        int arr[]={1,2,3,4,5};
        reverse(arr);

        //Q2 part 
         int brr[]={20,30,40,50,60};
          shift(brr);
          for (int a : brr) {
            System.out.println(a+" ");
            
          }
          System.out.println();

          //Q3 part
          int crr[]={1,2,3,4,5};
          alt(crr);
        
    }
    
}
