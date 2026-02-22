public class linear_binary_search {
    public static void linear(int a[],int target){
        for (int i=0;i<a.length;i++){
            if (a[i]==target){
                System.out.println("Element present in array at index : "+i);
                break;
            }
        }
    }

    public static void binary(int arr[], int target){
        int l=0;
        int r=arr.length;

//        System.out.println(arr[mid]);
//        System.out.println(l);
         while (l<r){
             int mid= (l+r)/2;
             if (arr[mid]==target){
                 System.out.println("found on index : "+mid);
                 break;
             }
             if (target>arr[mid]){
                 l=mid+1;
             }
             else  {
                 r=mid-1;
             }
         }

    }
    public static void main(String[] args) {
        //linear
//        int arr[]={1,45,25,4,54};
//        linear(arr,4);

        //binary

        int array[]={1,5,11,21,55,75,99};
//        System.out.println(array.length);
        binary(array,99);
    }
}
