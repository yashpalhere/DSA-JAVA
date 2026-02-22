import java.util.Arrays;

public class leftmostpivotindex {
    public static int pivotIndex(int[] nums){
        int idx=-1;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum= sum+nums[i];
        }
        int leftsum=0;
        System.out.println(sum);
        for (int i = 0; i < nums.length ; i++) {

            int rightsum= sum-leftsum-nums[i];
            System.out.println(leftsum);
            System.out.println(rightsum);
            if (leftsum==rightsum)  {
                idx=i;
                System.out.println(idx);
                return idx;
            }
            leftsum= leftsum+nums[i];
            System.out.println(leftsum);
        }
        System.out.println(idx);
        return idx;
    }

    public static void main(String[] args) {
        int nums[]={1,7,3,6,5,6};
//        -1,-1,-1,-1,0,1
        pivotIndex(nums);
    }
}
