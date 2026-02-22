import java.util.Arrays;

public class all_duplicates_array {
    public static void allduplicate(int arr[]){
        Arrays.sort(arr);
        int dup[]=new int[(arr.length)/2];
        int x=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                dup[x]=arr[i];
                x=x+1;
            }

        }
        for (int i = 0; i < x; i++) {
            System.out.println(dup[i]);
        }
//        int dup[]=new int[(arr.length)/2];
//        int x=0;
//        for (int i = 0; i < arr.length; i++) {
//            if ()
//        }

    }

    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        allduplicate(arr);
    }
}

