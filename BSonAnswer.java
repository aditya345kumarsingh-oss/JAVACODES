public class BSonAnswer {

    public int mysqrt(int x){
        int s=0;
        int e=x;
        int ans =-1;

        while (s<=e) {
            int mid =s+(e-s)/2;

            if (mid *mid ==x){
                return mid;
               }

            else if (mid * mid >x){
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
        int x = 16; // Example input for square root calculation
        BSonAnswer obj = new BSonAnswer();
        int result = obj.mysqrt(x);
        System.out.println("The square root of " + x + " is: " + result);
        
    }
    
}
