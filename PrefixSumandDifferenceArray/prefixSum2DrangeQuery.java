public import java.util.Scanner;

public class prefixSum2DrangeQuery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Read the matrix
        int[][] v = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                v[i][j] = scanner.nextInt();
            }
        }

        // Compute prefix sum matrix
        int[][] pre = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pre[i][j] = v[i][j];
                if (j > 0) {
                    pre[i][j] += pre[i][j - 1];
                }
                if (i > 0) {
                    pre[i][j] += pre[i - 1][j];
                }
                if (i > 0 && j > 0) {
                    pre[i][j] -= pre[i - 1][j - 1]; // Avoid double-counting
                }
            }
        }

        // Process queries
        int q = scanner.nextInt();
        while (q-- > 0) {
            int l1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int l2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            int ans = pre[l2][r2];
            if (l1 > 0) {
                ans -= pre[l1 - 1][r2];
            }
            if (r1 > 0) {
                ans -= pre[l2][r1 - 1];
            }
            if (l1 > 0 && r1 > 0) {
                ans += pre[l1 - 1][r1 - 1]; // Add back the overlapping region
            }
            System.out.print(ans + " ");
        }

        scanner.close();
    }
} {
    
}
