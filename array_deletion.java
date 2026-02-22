

public class array_deletion {
    public static void deletearr1(int arr[], int size ,int index){

//        arr[index]=arr
        for (int i = index; i <=size -2; i++) {
            arr[i] = arr[i+1];
        }

    }
    public static void main(String[] args) {

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
        deletearr1(arr,size,5);
        size-=1;
        obj.prtarr(arr,size);


    }
}
