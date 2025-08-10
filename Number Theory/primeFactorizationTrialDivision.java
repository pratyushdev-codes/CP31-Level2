import java.util.ArrayList;
import java.util.Scanner;

public class primeFactorizationTrialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) { // divide repeatedly
                list.add(i);
                n /= i;
            }
        }

        // if n is still > 1, it is a prime factor
        if (n > 1) {
            list.add(n);
        }

        for (int factor : list) {
            System.out.println(factor);
        }
    }
}
