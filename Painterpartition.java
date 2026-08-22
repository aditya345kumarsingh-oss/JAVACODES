public class Painterpartition {
    // Check if allocation is possible
    static boolean ispollsible(int [] boards , int painters , int maxlength){
        int paintercount=1;
        int length =0;
        // Iterate through all the boards
        for(int i=0; i<boards.length;i++){
            //one board  is greater than allowed length 
            if (boards[i]>maxlength){
                return false;

            }
            // Give board to current painter
            if (length + boards[i]<=maxlength){
                length=length + boards[i];
            }
            //give board to next painter 
            else {
                paintercount++;
                length = boards[i];
                // Too many painters required
                if (paintercount > painters){
                    return false;
                }
            }
        }
        return true;
    }

    static int painterpartition(int [] boards , int painters){
        // More painters than boards
        if (painters > boards.length){
            return -1;
        }
        int s=0;
        int e=0;
        int ans=-1;
        // Find total length
        for (int i=0;i<boards.length;i++){
            e=e+boards[i];
        }
        // Binary Search on Answer
        while (s<=e){
            int mid = s + (e-s)/2;
            if (ispollsible(boards,painters,mid)){
                ans=mid;
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int [] boards = {10,20,30,40, 50};
        int painters = 2;
        int result = painterpartition(boards,painters);
        System.out.println("Painting time: " + result);
    }
}
