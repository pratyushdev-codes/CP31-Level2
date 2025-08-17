import java.util.*;

public class coprime {
    static List<Integer>[] pairs = new ArrayList[1001];

    // gcd function
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] idx = new int[1001];

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            idx[x] = i; // store last occurrence index
        }

        int ans = -1;
        for (int i = 1; i <= 1000; i++) {
            if (idx[i] == 0) continue; // number not in array
            for (int j : pairs[i]) {
                if (idx[j] != 0) {
                    ans = Math.max(ans, idx[i] + idx[j]);
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Precompute coprime pairs
        for (int i = 0; i <= 1000; i++) {
            pairs[i] = new ArrayList<>();
        }
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if (gcd(i, j) == 1) {
                    pairs[i].add(j);
                }
            }
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}
