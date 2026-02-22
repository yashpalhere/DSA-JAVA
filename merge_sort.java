public class merge_sort {

    public static void mergeArr(int arr[],int s, int e){
        int count =0;
        int mid= s+(e-s)/2;
        int l1= mid-s+1;
        int l2= e-mid;
        int copyarr1 []= new int [l1];
        int copyarr2[]= new int [l2];

        for (int i = 0; i < l1; i++) {
            copyarr1[i]=arr[s+i];
        }
        for (int i = 0; i < l2; i++) {
            copyarr2[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=s;
        while (i<l1 && j<l2){
            if(copyarr1[i]>copyarr2[j]){
                count++;
                arr[k++]=copyarr2[j++];
            }
            else {
                arr[k++]= copyarr1[i++];
            }
        }
        while (i<l1){
            arr[k++]=copyarr1[i++];

        }
        while (j<l2){
            arr[k++]=copyarr2[j++];
        }

        System.out.println(count);
    }
    public  static void mergeSort(int arr[],int s,int e){
        if (s>=e){
            return;
        }
        int mid= s+(e-s)/2;
        //left part ko sort karne ka
        mergeSort(arr,s,mid);
        //right part ko sort karne ka
        mergeSort(arr,mid+1,e);
        //merge
        mergeArr(arr,s,e);


    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        int n= arr.length;
        mergeSort(arr,0,n-1);
        for(int num : arr){
            System.out.print(num + " ");
        }


    }
}
