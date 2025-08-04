import java.util.*;

class BitwiseEquationCC {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        long a = (1L << 36) + (1L << 37);
        long b = (1L << 36);
        long c = (1L << 35);

        while (t-- > 0) {
            long N = sc.nextLong(); // fix here
            long d = (1L << 36) + (1L << 35) + N;
            System.out.println(a + " " + b + " " + c + " " + d);
        }
    }
}
