
import java.util.Scanner;

class prioritynonpreemtive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int bt[] = new int[n];
        int pr[] = new int[n];
        int wt[] = new int[n];
        int ct[] = new int[n];
        int tat[] = new int[n];
        int pid[] = new int[n];

        System.out.println("Enter Burst Time and Priority");

        for(int i=0;i<n;i++){
            pid[i] = i+1;

            System.out.print("P"+pid[i]+" Burst Time: ");
            bt[i] = sc.nextInt();

            System.out.print("P"+pid[i]+" Priority: ");
            pr[i] = sc.nextInt();
        }

        // Sorting according to priority
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(pr[i] > pr[j]){

                    int temp = pr[i];
                    pr[i] = pr[j];
                    pr[j] = temp;

                    temp = bt[i];
                    bt[i] = bt[j];
                    bt[j] = temp;

                    temp = pid[i];
                    pid[i] = pid[j];
                    pid[j] = temp;
                }
            }
        }

        wt[0] = 0;
        ct[0] = bt[0];
        tat[0] = ct[0];

        for(int i=1;i<n;i++){
            wt[i] = wt[i-1] + bt[i-1];
            ct[i] = ct[i-1] + bt[i];
            tat[i] = ct[i];
        }

        System.out.println("\nPID\tBT\tPR\tWT\tCT\tTAT");

        for(int i=0;i<n;i++){
            System.out.println(pid[i]+"\t"+bt[i]+"\t"+pr[i]+"\t"+wt[i]+"\t"+ct[i]+"\t"+tat[i]);
        }

        sc.close();
    }
}
