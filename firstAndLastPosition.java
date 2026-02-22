import java.util.*;
public class firstAndLastPosition {
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int solution[]= {-1,-1};
        int l=0;
        int r= n-1;
        int mid= l+(r-l)/2;
        while(l<=r){
            if (arr.get(mid)==k ){
                solution[0]=mid;
                r= mid-1;
            } else if (k > arr.get(mid)) {
                l=mid+1;
            }
            else{
                r= mid-1;
            }
            mid= l+(r-l)/2;
        }
        System.out.println(solution[0]);
        l=0;
        r= n-1;
        while(l<=r){
            if (arr.get(mid)==k ){
                solution[1]=mid;
                l= mid+1;
            } else if (k > arr.get(mid)) {
                l=mid+1;

            }
            else{
                r= mid-1;
            }
            mid= l+(r-l)/2;
        }

        System.out.println(solution[1]);
    return solution;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();  //0 0 1 1 2 2 2 2
        arr.add(0,0);
        arr.add(1,0);
        arr.add(2,1);
        arr.add(3,1);
        arr.add(4,2);
        arr.add(5,2);
        arr.add(6,2);
        arr.add(7,2);
        int n= arr.size();
        int k = 2;
        System.out.println(firstAndLastPosition(arr,n,k));
    }
}
