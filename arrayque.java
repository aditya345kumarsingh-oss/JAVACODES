public class arrayque {
    // Q1. Find the average of array element 
    static double getavg(int[]arr){
        int sum =0;
        for(int i:arr){
            sum+=i;
        }
        int size = arr.length;
        double avg =sum/size;
        return avg;
    }

    //Q2.Multiply each element of array by 10
    static int []multiply(int[]arr){
        int size=arr.length;
        int newArray[]=new int [size];

        for(int i =0; i<size ; i++){
            int element =arr[i];
            int newelement =element*10;
            newArray[i] = newelement;
        }
        return newArray;
    }

    //Q3. Search for an element in an array-- Linear Search
    static boolean elementfind(int crr[], int target){
        for(int i=0 ; i<crr.length ; i++){
            if (crr[i]==target) {
                return true;
                
            }
        }
        return false;
    }


    //Q4. Find the maximum element in an array
    static int getmaximum(int drr[]) {
    int max = drr[0];

    for (int i = 0; i < drr.length; i++) {
        max = Math.max(max, drr[i]);
    }

    return max;
}

    //Q5. Find the minimun element in an array
    static int getMinimum(int err[]) {

    int min = err[0];

    for (int i = 1; i < err.length; i++) {
        min = Math.min(min, err[i]);
    }

    return min;
}


// Q6. Return sum of +ve and -ve number
 static int[] getpositiveandnegative(int frr[]) {
    int possum = 0;
    int negsum = 0;

    for (int i = 0; i < frr.length; i++) {
        if (frr[i] > 0) {
            possum += frr[i];
        } else if(frr[i] < 0) {
            negsum += frr[i];
        }
    }

    int result[] = {possum, negsum};
    return result;
}



// Q7. Count the number of zeros and ones
static int [] getzeroone(int grr[]){
    int zero =0;
    int one=0;
    for (int i = 0; i < grr.length; i++) {
        if (grr[i]==0){
            zero++;
        }
        else{
            one++;
        }
}
int answ[]={zero,one};
return answ;
}

//Q8. Find the first unsorted element array 
static int getunsorted(int hrr[]) {

    for (int i = 0; i < hrr.length - 1; i++) {

        if (hrr[i + 1] < hrr[i]) {
            return hrr[i + 1];
        }
    }

    return -1;
}


    public static void main(String[] args) {
        //Q1 part
        int []arr={2,4,5,1};
       System.out.println(getavg(arr));

        //Q2 part 
        int brr[]={2,4,5,1};
        int ans[]= multiply(brr);
        System.out.println("print array:");
        for (int i : ans) {
    System.out.println(i);
}
// Q3 part
int crr[]={2,4,5,1};
boolean ans3 = elementfind(crr, 40);
System.out.println(ans3);

//Q4 part 
int drr[]= {2,4,5,1};
System.out.println("Maximum element = " + getmaximum(drr));

//Q5 part
int err[]= {2,4,5,1};
System.out.println("Minimum element = " + getMinimum(err));

//Q6 part
int frr[] = {2, -4, 5, -1};

int result[] = getpositiveandnegative(frr);

System.out.println("Positive sum: " + result[0]);
System.out.println("Negative sum: " + result[1]);

//Q7 part
int grr[] = {1, 0, 0, 1};

int answ[] = getzeroone(grr);

System.out.println("zero: " + answ[0]);
System.out.println("one: " + answ[1]);

// Q8 part
int hrr[]={1,2,6,5,4,8};
System.out.println(getunsorted(hrr));
      
      
}
    
}


