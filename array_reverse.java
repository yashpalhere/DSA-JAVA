import java.util.* ;

public class array_reverse {
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int e= arr.size()-1;
        int s= m+1;
        while(s<e){
            Collections.swap(arr,s,e);
            s++;
            e--;
        }
    }
}
