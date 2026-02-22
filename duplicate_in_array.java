import java.util.Arrays;

public class duplicate_in_array {
    public static int duplicate(int arr[]){
        Arrays.sort(arr);
        int dnum=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                dnum= arr[i];
                return dnum;
            }
        }
        return dnum;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,4};
        System.out.println(duplicate(arr));
    }
}
