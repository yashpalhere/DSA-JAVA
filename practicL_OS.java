

import java.util.Scanner;

class practicL_OS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        System.out.print("Enter number of resources: ");
        int m = sc.nextInt();

        int[][] alloc = new int[n][m];
        int[][] max = new int[n][m];
        int[][] need = new int[n][m];
        int[] avail = new int[m];

        System.out.println("Enter Allocation Matrix:");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                alloc[i][j]=sc.nextInt();

        System.out.println("Enter Max Matrix:");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                max[i][j]=sc.nextInt();

        System.out.println("Enter Available Resources:");
        for(int i=0;i<m;i++)
            avail[i]=sc.nextInt();

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                need[i][j]=max[i][j]-alloc[i][j];

        boolean[] finish = new boolean[n];
        int[] safe = new int[n];
        int count=0;

        while(count<n) {

            boolean found=false;

            for(int i=0;i<n;i++) {

                if(!finish[i]) {

                    int j;
                    for(j=0;j<m;j++)
                        if(need[i][j]>avail[j])
                            break;

                    if(j==m) {

                        for(int k=0;k<m;k++)
                            avail[k]+=alloc[i][k];

                        safe[count++]=i;
                        finish[i]=true;
                        found=true;
                    }
                }
            }

            if(!found) {
                System.out.println("System is not in safe state");
                return;
            }
        }
        System.out.println("Safe Sequence:");
        for(int i=0;i<n;i++)
            System.out.print("P"+safe[i]+" ");

        sc.close();

    }
}