public class arrayque4 {

    //Q1. Two sum 

static int [] twosum(int [] arr, int target){
    int n=arr.length;
    for (int i=0 ; i<n-1 ; i++){
        for (int j=i+1 ; j<n ; j++){
            if (arr [i]+ arr[j]==target){
                int ans[]={i,j};
                return ans;

            }
        }

    }
    int ans[] ={};
    return ans;
      
}
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,};
        int target = 9;

        int[] result = twosum(arr, target);

        if (result.length == 0) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Indices: " + result[0] + " " + result[1]);
            System.out.println("Values: " + arr[result[0]] + " " + arr[result[1]]);
        }

        
    }
    
}
