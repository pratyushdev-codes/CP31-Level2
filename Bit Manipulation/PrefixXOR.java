import java.util.*;

public class PrefixXOR {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        int[] pre = new int[n];
        pre[0] = v[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] ^ v[i];
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            l--; r--; // converting to 0-based indexing

            if (l == 0) {
                System.out.println(pre[r]);
            } else {
                System.out.println(pre[r] ^ pre[l - 1]);
            }
        }
        // Time Complexity: O(N + Q)
    }

    public static void main(String[] args) {
        solve();
    }
}
