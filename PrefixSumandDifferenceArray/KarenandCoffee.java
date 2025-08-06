import java.util.*;

public class KarenandCoffee {
    static final int MAXN = 200005;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        
        // Difference array to mark temperature ranges
        int[] diff = new int[MAXN];
        
        // Read n recipes and mark ranges using difference array
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            diff[l]++;
            diff[r + 1]--;
        }
        
        // Convert difference array to actual count array
        for (int i = 1; i < MAXN; i++) {
            diff[i] += diff[i - 1];
        }
        
        // Create prefix sum array for admissible temperatures
        int[] prefixSum = new int[MAXN];
        for (int i = 0; i < MAXN; i++) {
            if (diff[i] >= k) {
                prefixSum[i] = 1;
            }
        }
        
        // Convert to actual prefix sum
        for (int i = 1; i < MAXN; i++) {
            prefixSum[i] += prefixSum[i - 1];
        }
        
        // Answer queries
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int result = prefixSum[b] - prefixSum[a - 1];
            System.out.println(result);
        }
        
        sc.close();
    }
}