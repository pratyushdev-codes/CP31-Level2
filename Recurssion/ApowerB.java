import java.util.Scanner;

public class ApowerB {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(findPow(a, b));
    }

    public static int findPow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        return findPow(a, b - 1) * a;
    }
}
