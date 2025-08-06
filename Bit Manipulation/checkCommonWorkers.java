import java.util.*;

public class checkCommonWorkers {
    public static void solve() {
        BitSet b1 = new BitSet(40);
        BitSet b2 = new BitSet(40);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            b1.set(x);
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            b2.set(x);
        }

        BitSet b3 = (BitSet) b1.clone(); // Clone b1
        b3.and(b2);                      // AND with b2

        System.out.println(b3.cardinality()); // Count of common set bits
    }

    public static void main(String[] args) {
        solve();
    }
} {
    
}
