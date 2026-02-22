import java.util.* ;
import java.io.*;
public class triplet_sum {

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        ArrayList<Integer> nothing = new ArrayList<>();
        Arrays.sort(arr);
        nothing.add(-1);    //10 5 5 5 2  6   1 1 2 2 3 3
        outer.add(nothing);
        for (int i = 0; i < n-2; i++) {
            int l=i+1;
            int r= n-1;

            while (l<r){
                int sum= arr[i]+arr[l]+arr[r];

                if (sum==K){
                    ArrayList<Integer> inner = new ArrayList<>();
                    inner.add(arr[i]);
                    inner.add(arr[l]);
                    inner.add(arr[r]);
//
                    outer.add(inner);
                    l++;
                    r--;
                } else if (sum > K) {
                    r--;
                }
                else {
                    l++;
                }
            }
        }
        outer.remove(0);
        Set<ArrayList<Integer>> set =  new LinkedHashSet<>(outer);
        outer= new ArrayList<>(set);
        return outer;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3};
        int n=arr.length;
        int k=6;
        System.out.println(findTriplets(arr,n,k));
    }
}
