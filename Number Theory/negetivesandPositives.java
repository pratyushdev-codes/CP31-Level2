import java.util.*;

public class negetivesandPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            int negs = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] < 0) {
                    negs++;
                    a[i] = -a[i];
                }
                sum += a[i];
            }

            Arrays.sort(a); // O(n log n)

            if ((negs & 1) == 1) {
                sum -= 2L * a[0]; // subtract twice the smallest absolute value
            }

            System.out.println(sum);
        }

        sc.close();
    }
}



// Old sum contribution = +x
// New sum contribution = -x
// Difference = -x - (+x) = -2x