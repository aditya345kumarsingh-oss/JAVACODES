public class AlmostSorted {
    public int findElementInAlmostSortedArray(int [] arr,int k ){
        int s=0;
        int e= arr.length-1;

        while (s<=e){
            int mid = s+(e-s)/2;
            
            if (mid -1 >= 0 && arr[mid-1] == k){
                return mid-1;
            }
            if (arr[mid] == k){
                return mid;
            }
            if (mid +1 < arr.length && arr[mid+1] == k){
                    return mid+1;

                    if (k > arr[mid]){
                        //move right
                        s= mid+1;
                    } else {
                        // move left 
                        e= mid-1;
                    }
                }
                return -1; // Element not found

            }
        }
        public static void main(String[] args) {
            AlmostSorted almostSorted = new AlmostSorted();
            int[] arr = {10, 3, 40, 20, 50, 80, 70};
            int k = 40;
            int index = almostSorted.findElementInAlmostSortedArray(arr, k);
            if (index != -1) {
                System.out.println("Element " + k + " found at index: " + index);
            } else {
                System.out.println("Element " + k + " not found in the array.");
            }
        }
    }
    
}
