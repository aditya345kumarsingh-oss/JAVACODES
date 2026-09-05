public class RotiPrata {
    static boolean isvalid(int [] cook , int n,int p,int mid){
        int time=0;
        for(int i=0;i<n;i++){
            int j=1;
            while(time+ (j*cook[i])<=mid){
                time+= (j*cook[i]);
                j++;
            }
        }
        return time>=p;
    }
    static int minTime(int [] cook , int n,int p){
        int maxRank=-1;
        for(int i=0;i<n;i++){
            if (cook[i]>maxRank){
                maxRank=cook[i];
            }
        }
    static boolean isPossible(int [] cook , int n,int p){
        int maxRank=-1;
        for(int i=0;i<cook.length;i++){
            if (cook[i]>maxRank){
                maxRank=cook[i];
            }
        }
    }
    
}
int s=0;
int e = maxRank * (p*(p+1)/2);
int ans = -1;
while (s<=e){
    int mid = s + (e-s)/2;
    if (isPossible(cook,n,p,mid)){
        ans = mid;
        e = mid-1;
    }
    else{
        s = mid+1;
    }
}
return ans;
}
}