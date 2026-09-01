public class EkoSpoj {
    static boolean ispossible (int[]arr, int mid ,int m ){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > mid){
                sum += arr[i]-mid;
            }

        }
        return sum >= m;
    }
    
}
