import java.util.*;
import java.io.*;

public class makealmostequalwithmod {
    
    static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        long[] v = new long[n];
        
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            v[i] = Long.parseLong(input[i]);
        }
        
        for (int i = 1; i <= 61; i++) {
            long num = (1L << i);  // 2^i
            Set<Long> st = new HashSet<>();
            
            for (int j = 0; j < n; j++) {
                st.add(v[j] % num);
            }
            
            if (st.size() == 2) {
                System.out.println(num);
                return;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            solve();
        }
    }
}