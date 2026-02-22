import java.util.*;

public class pair_sum {
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> list = new ArrayList<>();
        int i = 0, j = 1;
        Arrays.sort(arr);
        while (i < arr.length-1  && j < arr.length) {
            if(arr[i]+arr[j]==s ){
                list.add(new int[]{arr[i],arr[j]});
                if(j==arr.length-1){
                    i++;
                    j=i+1;
                }
                else{
                    j++;
                }

            }
            else if(j==arr.length-1){
                i++;
                j=i+1;
            }
            else{
                j++;
            }
        }
        return list;

    }

    public static void main(String[] args) {

    }
}

//    5 4
//     1 2 3 4 5

