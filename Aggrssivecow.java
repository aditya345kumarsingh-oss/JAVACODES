public class Aggrssivecow {
    static boolean ispossible (int [] stalls, int cow , int maxdistance){
        int count = 1;
        int lastpos=stalls[0];
        for (int i=1;i<stalls.length;){
            if (stalls[i]-lastpos>=maxdistance){
                count++;
                lastpos=stalls[i];
                
            }

        }
        return count>=cow;
    }
    
}
