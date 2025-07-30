import java.util.*;

public class gregandArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        // Read the initial array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Store operations
        int[][] operations = new int[m][3];
        for(int i = 0; i < m; i++) {
            operations[i][0] = sc.nextInt(); // l
            operations[i][1] = sc.nextInt(); // r
            operations[i][2] = sc.nextInt(); // d
        }
        
        // Count how many times each operation is applied
        int[] opCount = new int[m + 1];
        for(int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            opCount[x - 1]++;     // Convert to 0-based indexing
            opCount[y]--;         // Range update using difference array
        }
        
        // Calculate actual count for each operation
        for(int i = 1; i < m; i++) {
            opCount[i] += opCount[i - 1];
        }
        
        // Apply operations to the array using difference array technique
        long[] diff = new long[n + 1];
        for(int i = 0; i < m; i++) {
            int l = operations[i][0] - 1; // Convert to 0-based indexing
            int r = operations[i][1] - 1; // Convert to 0-based indexing
            long d = (long)operations[i][2] * opCount[i];
            
            diff[l] += d;
            diff[r + 1] -= d;
        }
        
        // Calculate prefix sum to get actual values to add
        for(int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }
        
        // Output the final array
        for(int i = 0; i < n; i++) {
            System.out.print((arr[i] + diff[i]));
            if(i < n - 1) System.out.print(" ");
        }
        System.out.println();
        
        sc.close();
    }
}