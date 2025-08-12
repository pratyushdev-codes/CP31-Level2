import java.util.*;

public class SquareDifference {

    static boolean isPrime(long n) {
        if (n <= 1) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (Math.abs(a - b) == 1 && isPrime(a + b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
