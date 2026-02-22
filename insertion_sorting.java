public class insertion_sorting {
    public static void insertionSort(int n , int[] arr) {
        for (int i = 1 ; i < n; i++) {
            int temp=arr[i];        //4 12 11 20
            int j =i-1;
            for (; j >=0; j--) {
                if (arr[j]>temp){
                    arr[j+1]=arr[j];
                }
                else break;
            }
            arr[j+1]=temp;
        }
    }
}
