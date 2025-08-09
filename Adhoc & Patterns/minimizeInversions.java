import java.util.*;

public class minimizeInversions {
    static class Pair {
        int first, second;
        Pair(int f, int s) {
            first = f;
            second = s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            // Step 1: Create pairs
            Pair[] pairs = new Pair[n];
            for (int i = 0; i < n; i++) {
                pairs[i] = new Pair(a[i], b[i]);
            }

            // Step 2: Sort pairs by first element, then by second
            Arrays.sort(pairs, (p1, p2) -> {
                if (p1.first != p2.first) return p1.first - p2.first;
                return p1.second - p2.second;
            });

            // Step 3: Extract sorted arrays
            for (int i = 0; i < n; i++) {
                output.append(pairs[i].first).append(" ");
            }
            output.append("\n");
            for (int i = 0; i < n; i++) {
                output.append(pairs[i].second).append(" ");
            }
            output.append("\n");
        }

        System.out.print(output);
    }
}
