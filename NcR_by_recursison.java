public class NcR_by_recursison {
    public static int calNcr(int n , int r){
        if(r<0){
           return 0;
        }
        if(r==0 || r==n){
            return 1;
        }
        
        return calNcr(n-1,r-1)+calNcr(n-1,r);
    }


    public static void main(String[] args) {
        int val = calNcr(5,2);
        System.out.println(val);

    }
}

