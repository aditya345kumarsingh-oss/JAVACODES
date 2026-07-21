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

//Q9. Swap Alternate Elements in an Array
 static void swapAlternate(int irr[]) {

        for (int i = 0; i < irr.length - 1; i += 2) {

            int temp = irr[i];
            irr[i] = irr[i + 1];
            irr[i + 1] = temp;
        }
    }

    //Q10. Print Array Intersection
    static void intersection(int jrr1[], int jrr2[]) {

        for (int i = 0; i < jrr1.length; i++) {

            for (int j = 0; j < jrr2.length; j++) {

                if (jrr1[i] == jrr2[j]) {
                    System.out.print(jrr1[i] + " ");
                    break;
                }
            }
        }
    }



//Q11. Print Alternate Extreme Elements
static void alternateExtreme(int krr[]) {

        int left = 0;
        int right = krr.length - 1;

        while (left <= right) {

            System.out.print(krr[left] + " ");

            if (left != right) {
                System.out.print(krr[right] + " ");
            }

            left++;
            right--;
        }
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
 
//Q9 part

        int irr[] = {10, 20, 30, 40, 50, 60};

        swapAlternate(irr);

        System.out.println("After swapping:");

        for (int i : irr) {
            System.out.print(i + " ");
        }

        //Q10.part
         int jrr1[] = {1, 2, 3, 4, 5};
        int jrr2[] = {3, 4, 5, 6, 7};

        System.out.println("Intersection elements:");

        intersection(jrr1, jrr2);

        //Q11 part
        int krr[] = {10, 20, 30, 40, 50};

        System.out.println("Alternate Extreme Elements:");

        alternateExtreme(krr);

      
}
    
}


