import java.util.*;

public class PointsOnLine {
    static long n, d;
    static long[] v;

    public static void solve(Scanner sc) {
        n = sc.nextLong();
        d = sc.nextLong();
        v = new long[(int)n];
        for (int i = 0; i < n; i++) v[i] = sc.nextLong();

        if (n < 3) {
            System.out.println(0);
            return;
        }

        long answer = 0;

        for (int i = 0; i < n - 2; i++) {
            // Binary search upper_bound equivalent in Java
            int j = upperBound(v, v[i] + d, i, (int)n);

            long l = j - i - 1; // how many points in range
            if (l >= 2) {
                answer += (l * (l - 1)) / 2; // C(l, 2) , The number of ways to choose 2 points out of l is the combination formula:
            }
        }

        System.out.println(answer);
    }

    // Upper bound implementation in Java
    static int upperBound(long[] arr, long target, int left, int right) {
        int l = left, r = right;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= target) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
