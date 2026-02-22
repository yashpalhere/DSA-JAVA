public class rowWiseSum_2dArr {
    public static int[] RowWiseSum(int arr[][]){
        int rowsum[]=new int[3];
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[0].length; j++) {
                sum = sum + arr[i][j];
            }
            rowsum[i]= sum;
        }
        for (int i = 0; i < rowsum.length; i++) {
            System.out.println(rowsum[i]);
        }
        return rowsum;
    }
    public static int largestRow(int arr[][]){
        int largestval[] =RowWiseSum(arr);
        int large= 1;
        for (int i = 1; i < largestval.length; i++) {
            if (largestval[i]>largestval[large]){
                large= i;
            }
        }
        return large+1;
    }
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4},
                {4,5,6,5},
                {7,8,9,5}
        };
        System.out.println("Largest row is : "+largestRow(arr));
    }
}
