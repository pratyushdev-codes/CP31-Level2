import java.util.*;
import java.io.*;

public class Adivison {
    
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            long p = sc.nextLong();
            long q = sc.nextLong();
            sb.append(solve(p, q)).append("\n");
        }
        
        System.out.print(sb.toString());
    }
    
    static long solve(long p, long q) {
        if (p % q != 0) return p; // already valid
        
        List<Long> primes = new ArrayList<>();
        long nq = q;
        
        // Trial division to get prime factors of q
        for (long i = 2; i * i <= nq; i++) {
            if (nq % i == 0) {
                primes.add(i);
                while (nq % i == 0) {
                    nq /= i;
                }
            }
        }
        if (nq > 1) {
            primes.add(nq);
        }
        
        long ans = p;
        for (long prime : primes) {
            long np = p, nq2 = q;
            long a = 0, b = 0;
            
            while (np % prime == 0) {
                a++;
                np /= prime;
            }
            while (nq2 % prime == 0) {
                b++;
                nq2 /= prime;
            }
            
            long drop = a - b + 1;
            long val = 1;
            for (int i = 0; i < drop; i++) {
                val *= prime;
            }
            ans = Math.min(ans, val);
        }
        
        return p / ans;
    }
    
    // Fast input reader
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
        
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
