import java.util.Scanner;

public class prefixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        
        int[] pre = new int[n];
        pre[0] = v[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + v[i];
        }
        
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.print((pre[r] - ((l == 0) ? 0 : pre[l - 1])) + " ");
        }
        
        scanner.close();
    }
}