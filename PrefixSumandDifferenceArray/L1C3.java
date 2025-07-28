import java.util.Scanner;

public class L1C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int pref1[] = new int[n + 1];
        int pref2[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            pref1[i + 1] = pref1[i] + (i * arr[i]);
            pref2[i + 1] = pref2[i] + arr[n - i - 1];
        }
        int queries = sc.nextInt();
        while (queries-- > 0) {
            int r = sc.nextInt();
            int l = sc.nextInt();

            int sum = (pref1[r] - pref1[l - 1]) - (l - 1) * (pref2[r] - pref2[l - 1]);
            System.out.println(sum);
        }
        sc.close();

    }
}
