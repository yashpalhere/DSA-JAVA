import java.lang.classfile.Signature;
import java.util.Scanner;
class myarray{
        int total_size;
        int used_size;
        int arr[];
        Scanner sc=new Scanner(System.in);

        public void createarray(int tsize,int usize){
                total_size=tsize;
                used_size=usize;
                arr= new int[tsize];
        }
        public void setarrray(){
                for (int i=0;i<used_size;i++){
                        System.out.println("Enter array element "+(i+1)+" of Abstract array: ");
                        arr[i]=sc.nextInt();
                }
        }
        public void showarray(){
                for (int i=0;i<used_size;i++){
                        System.out.println(arr[i]);
                }
        }
}
public class arrayadt {
        public static void main(String[] args) {
                Scanner sm= new Scanner(System.in);
                myarray arr= new myarray();

                System.out.println("Enter the Total Size of Abstract Array: ");
                int tsize = sm.nextInt();

                System.out.println("Enter the Total Size of Abstract Array: ");
                int usize= sm.nextInt();

                arr.createarray(tsize,usize);
                arr.setarrray();
                arr.showarray();
        }
}
