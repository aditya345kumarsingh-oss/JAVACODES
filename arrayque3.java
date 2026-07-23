public class arrayque3 {

    //Q1 soart an array of 0s and 1s
    static int[] sort(int[] arr) {
    int n = arr.length;
    int i = 0;
    int j = n - 1;

    while (i < j) {

        if (arr[i] == 1 && arr[j] == 0) {
            arr[i] = 0;
            arr[j] = 1;
            i++;
            j--;
        }
        else if (arr[i] == 0) {
            i++;
        }
        else if (arr[j] == 1) {
            j--;
        }
    }

    return arr;
}

//Q2 missing number
static int missing(int []nums){
    int xorsum=0;
    for (int n : nums) {
        xorsum=xorsum^n;
        
    }
    int n= nums.length;
    for(int i=0 ; i<=n; i++){
        xorsum=xorsum^i;

    }
    return xorsum;

}
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 1, 0};
          sort(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");

        }

         int[] nums = {3, 0, 1};

        int ans = missing(nums);

        System.out.println("Missing Number: " + ans);
        
    }
    
}
