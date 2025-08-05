import java.util.Scanner;

public class RisingBacteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
                ans++;
            }

        }
        System.out.println(ans);
    }

}