import java.util.*;

public class NoPrimeDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] ans = new int[n][m];
            int count = 1;
            
            // Fill even rows first (0, 2, 4, ...)
            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < m; j++) {
                    ans[i][j] = count;
                    count++;
                }
            }
            
            // Fill odd rows next (1, 3, 5, ...)
            for (int i = 1; i < n; i += 2) {
                for (int j = 0; j < m; j++) {
                    ans[i][j] = count;
                    count++;
                }
            }
            
            // Print the grid
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(ans[i][j]);
                    if (j < m - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // New line after each row
            }
        }
        sc.close();
    }
}