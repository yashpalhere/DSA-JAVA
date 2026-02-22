import java.util.*;
public class cow_allocation {
    public static boolean possible(int []stalls, int k,int mid){
        int cowcount=1;
        int lastposition=stalls[0];  //5 3
                            //4 2 1 3 6  //1 2 3 4 5
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i]-lastposition==mid) {
                cowcount++;
                lastposition=stalls[i];
            }
            else {
                if (cowcount>k){
                    return false;
                }
            }
        }
        return true;
    }
    public static int aggressiveCows(int []stalls, int k) {
        int s=0;
        int e=(Arrays.stream(stalls).max().getAsInt())-(Arrays.stream(stalls).min().getAsInt());
        int ans=-1;
        Arrays.sort(stalls);
        while (s<=e){
            int mid= s+ ( e-s)/2;
            if (possible(stalls,k,mid)){
                ans=mid;
                s=mid+1;
            }
            else e=mid-1;
        }
        return ans;
    }
}
