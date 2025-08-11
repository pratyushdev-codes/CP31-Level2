import java.util.*;

public class AlmostPrine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count numbers with exactly 2 distinct prime factors
        int count = 0;
        for (int num = 2; num <= n; num++) {
            int primeFactors = 0;
            int temp = num;
            for (int p = 2; p <= n && p * p <= temp; p++) {
                if (isPrime[p] && temp % p == 0) {
                    primeFactors++;
                    while (temp % p == 0) {
                        temp /= p;
                    }
                }
            }
            if (temp > 1) { // Remaining prime factor
                primeFactors++;
            }
            if (primeFactors == 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
