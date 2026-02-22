import java.util.ArrayList;

public class intersection_element {
    public static ArrayList<Integer> intersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m){
        ArrayList<Integer> nothing= new ArrayList<>();
        nothing.add(0,-1);
        ArrayList<Integer> common = new ArrayList<>();
        boolean assign=false;
        int i=0;
        int j=0;
        while (i<n && j<m){
            if (arr1.get(i).equals(arr2.get(j))){
                common.add(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            }
            else {
                j++;
            }
        }
        if (assign==true){
            return common;
        }
        else {
            return nothing;
        }

    }

}
