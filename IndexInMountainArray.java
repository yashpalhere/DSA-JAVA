public class IndexInMountainArray {
    public static int peakIndexInMountainArray(int []arr){
        int idx=0;
        int l=0;
        int r=arr.length-1;
        int mid = l+ (r-l)/2;
        while (l<=r){
            if ( mid==0){
                idx=1;
                return idx;
            }
            else {
                if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                    idx = mid;
                    return idx;
                } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
                mid = l + (r - l) / 2;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int arr[]={1,7,8,9,3};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
