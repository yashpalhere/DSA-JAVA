class arr1{
    public void prtarr(int a[],int n){
        int arr[]= a;
        for (int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

public class array_insertion {
    public static void insertarr1(int arr[], int size, int element,int cap,int index){
            if (size>=cap){
                System.out.println("No Space");
            }
            else {
                for (int i = size - 1; i >= index; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[index]=element;

            }
    }
    public static void main(String[] args) {

        //traversal

        int arr[] = new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;
        arr1 obj = new arr1();
        int cap= arr.length;
//        System.out.println(cap);
        int size= 5;
        int insert= 45;
        insertarr1(arr,size,insert,cap,3);
        size+=1;
        obj.prtarr(arr,size);


    }
}
