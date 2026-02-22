import java.util.Arrays;

public class unique_Occurrence {
    public static boolean uniquefreq(int[] arr) {
        Arrays.sort(arr);
        int freq[]=new int[arr.length];
        int index=0;
        int x=0;

        for (int i = 0; i < arr.length; i++) {
            int count=1;
            while (i+1< arr.length && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            freq[index]=count;
            index++;
            x++;
        }
        int frequency[]=new int[x];
        for (int i = 0; i < x; i++) {
            frequency[i]=freq[i];
        }
        Arrays.sort(frequency);
        for (int i = 0; i <x-1 ; i++) {
            if (frequency[i]==frequency[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16};
        System.out.println(uniquefreq(arr));
    }
}
