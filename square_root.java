import java.util.ArrayList;

public class square_root {
    public static int sqrtN(long N){
        int sroot=0;
        long n= (int) N;
        long l=0;
        long r=n;
        long mid = l+ (r-l)/2;
        if (N==1){
            sroot=1;
            return sroot;
        }
        while (l<=r){
            if (mid==0){
                return sroot;
            }
            long midsquare=mid*mid;
            long nextsquare=(mid+1)*(mid+1);

            if (midsquare==N || (midsquare<N && nextsquare>N)){
                sroot= (int)mid;
                System.out.println(sroot);
                return sroot;
            } else if (midsquare>N) {
                r= mid-1;
            }
            else l= mid+1;
            mid = l+ (r-l)/2;
        }
        return sroot;
    }

    public static void main(String[] args) {

        sqrtN(2147395599 );
    }
}
