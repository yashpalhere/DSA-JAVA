import java.util.ArrayList;
import java.util.Arrays;

public class sort_01 {
    public static ArrayList<Integer> sort01(int arr[]){
        int r= arr.length-1;
        int l=0;
        while (l<=r  ) {
            if (arr[l]==0){
                l++;

            }
            if ( arr[r]==1){
                r--;
            }
            if (arr[r]!=1 && arr[l] ==1 || arr[l]!=0 && arr[r] ==0   ) {
                 arr[l]=0;
                 arr[r]=1;
                 r--;
                 l++;
            }

        }
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < arr.length;   i++) {
            list.add(i,arr[i]);

        }
        return list;
    }

    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,1,0};
        System.out.println(sort01(arr));
    }
}
