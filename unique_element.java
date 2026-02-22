public class unique_element {
    public static int unique(int arr[])
    {   // Time Complexity O(n^2)
//        int n= arr.length;
//        int unique=0;
//
//        for (int i = 0; i < n; i++) {
//            int target= arr[i];
//            int copy=0;
//            for (int j = 0; j < n; j++) {
//
//                if (i != j ) {
//                    if (target==arr[j]){
//                        copy=1;
//                    }
//                }
//            }
//            if (copy==0 ){
//                unique=target;
//                return unique;
//            }
//        }
//        return unique;

        //Using XOR Gate O(n)
        int unique=0;

        for (int i = 0; i < arr.length  ; i++) {
            unique= unique^arr[i];
        }
        return unique;
    }
    public static void main(String[] args) {
        int arr[]={3,7,2,2,7,3,13};
        System.out.println(unique(arr));
    }
}
