public class swap_alternatives {
    public static void Swapalt(int arr[]){
        int n= arr.length;
        int temp=0;
        for (int i = 0; i < n-1; i+=2) {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        Swapalt(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
