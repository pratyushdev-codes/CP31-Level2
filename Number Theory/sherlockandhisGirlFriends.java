import java.util.*;
import java.io.*;

public class sherlockandhisGirlFriends {
    static boolean[] prime = new boolean[100005];
    
    static void sieve() {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        
        for (int i = 4; i <= 100000; i += 2) {
            prime[i] = false;
        }
        
        for (int i = 3; i <= 100000; i += 2) {
            if (prime[i]) {
                for (int j = i * 2; j <= 100000; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        sieve();
        
        long pr = 0, npr = 0;
        for (int i = 2; i <= n + 1; i++) {
            if (prime[i]) {
                pr++;
            } else {
                npr++;
            }
        }
        
        if (npr == 0) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
        
        for (int i = 2; i <= n + 1; i++) {
            if (prime[i]) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
        
        sc.close();
    }
}