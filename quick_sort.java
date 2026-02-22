public class quick_sort {
    public static int partition(int arr[],int s,int e){
        int index=s;
        int pivot =arr[s];
        for (int i = s+1; i <=e; i++) {
            if (arr[i]<=pivot) index++;
        }
        int temp1 = arr[index];
        arr[index]= arr[s];
        arr[s]=temp1;

        int i =s,j=e;
        while (i<index && j>index){
            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return index;

    }
    public static void quickSort(int arr[],int s,int e){
        if(s>=e) return;
        int p= partition(arr,s,e);
        quickSort(arr,s,p-1);
        quickSort(arr,p+1,e);
    }

    public static void main(String[] args) {
        int arr[]={5,1,1,2,0,0};
        int n= arr.length;
        quickSort(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
