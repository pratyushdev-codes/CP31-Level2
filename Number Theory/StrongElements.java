import java.util.*;

public class StrongElements {
    
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(1);
            return;
        }

        int[] prefix_gcd = new int[n];
        int[] suffix_gcd = new int[n];

        prefix_gcd[0] = v[0];
        suffix_gcd[n - 1] = v[n - 1];

        for (int i = 1; i < n; i++) {
            prefix_gcd[i] = gcd(prefix_gcd[i - 1], v[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            suffix_gcd[i] = gcd(suffix_gcd[i + 1], v[i]);
        }

        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if (gcd(prefix_gcd[i - 1], suffix_gcd[i + 1]) != 1) {
                ans++;
            }
        }

        // checking for first element
        if (suffix_gcd[1] != 1) {
            ans++;
        }

        // checking for the last element
        if (prefix_gcd[n - 2] != 1) {
            ans++;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
