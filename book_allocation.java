import java.util.ArrayList;
import java.util.* ;
import java.io.*;
public class book_allocation {
    public static boolean isPossible(int time[],int n, int m,long mid){
        int daycount=1;
        long timesum=0;
        for (int i = 0; i < m; i++) {
            if (timesum+time[i]<=mid){
                timesum+=time[i];
            }
            else {
                daycount++;
                if (daycount>n || time[i]>mid){
                    return false;
                }
                timesum=time[i];
            }
        }
        return true;
    }
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        long s = Arrays.stream(time).max().getAsInt();
        long e = 0;
        for (int val : time) {
            e += val;
        }
        long ans=-1;

        while (s<=e){
            long mid = s + (e-s)/2;
            if (isPossible(time,n,m,mid)){
                ans=mid;
                e=mid-1;
            }
            else {
                s=mid+1;
            }

        }
        return ans;
    }
}
