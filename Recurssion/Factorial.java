import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFact(n));
    }

    public static int findFact(int n) {
        if (n == 0 || n == 1) {
            return 1;  
        }
        return n * findFact(n - 1);
    }
}
