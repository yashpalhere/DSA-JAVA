import java.awt.desktop.AboutEvent;
import java.util.*;
public class painters_problem {
    public static boolean Possible(ArrayList<Integer> boards, int k,int mid){
        int paintercount=1;
        int boardcount=0;

        for (int i = 0; i < boards.size(); i++) {
            if (boardcount+ boards.get(i)<=mid){
                boardcount+=boards.get(i);
            }
            else {
                paintercount++;
                if (paintercount>k || boards.get(i)>mid){
                    return false;
                }
                boardcount=boards.get(i);
            }
        }
        return true;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int s=Collections.max(boards);
        int e=0;
        for (int i: boards){
            e+=i;
        }
        int ans=-1;
        while (s<=e){
            int mid= s+ (e-s)/2;
            if (Possible( boards, k,mid)){
                ans=mid;
                e=mid-1;
            }
            else s=mid+1;
        }
        return ans;
    }
}
