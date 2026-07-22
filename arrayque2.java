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
    public static void main(String[] args) {

        //Q1 part 
        int arr[]={1,2,3,4,5};
        reverse(arr);
        
    }
    
}
