import java.util.*;

public class sorttheSubrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] a1 = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                a1[i] = sc.nextLong();
            }

            int first = -1, second = -1;

            // Find first differing index
            for (int i = 0; i < n; i++) {
                if (a[i] != a1[i]) {
                    first = i;
                    break;
                }
            }

            // Find last differing index
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] != a1[i]) {
                    second = i;
                    break;
                }
            }

            int first1 = -1, second1 = -1;

            // Extend left boundary
            for (int i = first; i > 0; i--) {
                if (a1[i] >= a1[i - 1]) {
                    first1 = i - 1;
                } else {
                    break;
                }
            }

            // Extend right boundary
            for (int i = second; i < n - 1; i++) {
                if (a1[i] <= a1[i + 1]) {
                    second1 = i + 1;
                } else {
                    break;
                }
            }

            // Print results (convert to 1-based indexing)
            if (first1 != -1) {
                System.out.print((first1 + 1) + " ");
            } else {
                System.out.print((first + 1) + " ");
            }

            if (second1 != -1) {
                System.out.println(second1 + 1);
            } else {
                System.out.println(second + 1);
            }
        }
        sc.close();
    }
}
