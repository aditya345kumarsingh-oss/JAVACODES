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


//Q2 . three sum
static void threesum(int[] brr, int targett){
        int m = brr.length;
        boolean found = false;

        for (int i = 0; i < m - 2; i++) {
            for (int j = i + 1; j < m - 1; j++) {
                for (int k = j + 1; k < m; k++) {

                    if (brr[i] + brr[j] + brr[k] == targett) {
                        System.out.println(brr[i] + " " + brr[j] + " " + brr[k]);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No triplet found.");
        }
    }

    // Q3. Remove duplicates from sorted array
    static int remove(int crr[]){
        int i=0;
        int j=1;
        int c=crr.length;
        while(j<c){
            if(crr [i]== crr[j]){
                j++;

            }
            else{
                i++;
                crr [i]=crr[j];
                j++;

            }

        }
        return i+1;
    }

    public static void main(String[] args) {
        //Q1 part 
        int arr[]={2,3,4,5,6,};
        int target = 9;

        int[] result = twosum(arr, target);

        if (result.length == 0) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Indices: " + result[0] + " " + result[1]);
            System.out.println("Values: " + arr[result[0]] + " " + arr[result[1]]);
        }
        //Q2 part

  int[] brr = {2, 3, 4, 5, 6};
        int targett= 12;

        threesum(brr, targett);

    //Q3 part

        int[] crr = {1,2,2,2,3,3,4,4,5};

        int length = remove(crr);

        System.out.println("Length = " + length);

        System.out.print("Array: ");

        for (int i = 0; i < length; i++) {
            System.out.print(crr[i] + " ");
        }
    }
}