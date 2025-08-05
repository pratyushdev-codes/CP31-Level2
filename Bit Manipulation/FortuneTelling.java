import java.util.*;

public class FortuneTelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            long n = sc.nextLong();  // length of array
            long x = sc.nextLong();  // Alice's starting number
            long y = sc.nextLong();  // Final number

            long[] v = new long[(int)n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }

            int f = 1; // parity toggle: 1 = even, 0 = odd
            for (int i = 0; i < n; i++) {
                if ((v[i] & 1) == 1) {
                    f = 1 - f;
                }
            }

            if ((x & 1) == 1) {
                if (((f ^ y) & 1) == 0) {
                    System.out.println("Alice");
                } else {
                    System.out.println("Bob");
                }
            } else {
                if (((f ^ y) & 1) == 0) {
                    System.out.println("Bob");
                } else {
                    System.out.println("Alice");
                }
            }
        }

        sc.close();
    }
}
