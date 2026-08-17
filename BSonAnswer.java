public class BSonAnswer {

    public int mysqrt(int x){
        int s=1;
        int e=x;
        int ans =-1;

        if (x==0){
            return 0;
        }

        while (s<=e) {
            int mid =s+(e-s)/2;

            if (mid ==x/mid){
                return mid;
               }

            else if ( mid >x/mid){
                e=mid-1; // move left
            }
            else{
                ans = mid;
                s=mid+1;    // move right
            }

    }
    return ans;
}
    public static void main(String[] args) {
        int x = 458753; // Example input for square root calculation
        BSonAnswer obj = new BSonAnswer();
        int result = obj.mysqrt(x);
        System.out.println("The square root of " + x + " is: " + result);
        
    }
    
}
