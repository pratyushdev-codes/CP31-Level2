import java.util.*;

public class smallestPrimeFactor {
    static final int N = (int) 1e7;
    static int[] spf = new int[N];

    // Precompute SPF for every number up to N
    static void computeSPF() {
        for (int i = 0; i < N; i++) {
            spf[i] = i;
        }
        for (int i = 2; i * i < N; i++) {
            if (spf[i] == i) { // i is prime
                for (int j = i * i; j < N; j += i) {
                    if (spf[j] == j) { // unmarked yet
                        spf[j] = i;
                    }
                }
            }
        }
    }

    // Factorize n using precomputed SPF
    static List<Integer> getPrimeFactors(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        while (n > 1) {
            primeFactors.add(spf[n]);
            n /= spf[n];
        }
        return primeFactors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        computeSPF(); // O(N log log N)

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> factors = getPrimeFactors(n);
            System.out.println(factors);
        }
    }
}
