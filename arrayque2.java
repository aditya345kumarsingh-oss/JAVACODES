import java.util.HashMap;

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

      //Q4 Find the mode of the array (means find higher freq)
      static int mode(int drr[]){
        HashMap<Integer , Integer> freq = new HashMap<>();
        for (int num : drr) {
            freq.put(num ,freq.getOrDefault(num, 0)+1);
            
        }
        int maxfreq= -1;
        int maxfrequ =-1;
        for (int key : freq.keySet()) {
            int currentkey= key;
            int currentkeys = freq.get(key);
            if(currentkeys>maxfreq){
                maxfreq= currentkeys;
                maxfrequ=currentkey;
            }
            
        }
        return maxfrequ;

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
        
          // Q4 part 
          int drr[]={1,2,2,3,4,5,5,5,5,3,6,7,1};
          mode(drr);
          System.out.println("Mode = " + mode(drr));
}
    }
    

